
## 短网址服务
### 短网址服务访问 
>1.localhost:port/{code} 短链接服务地址<br/>
>2.localhost:port/generate?url=xx&bit=x 短链接生成地址,url要decode提交,代表要生成的地址,bit代表要生成的位数(1<=bit<=6)<br/>
>3.localhost:port/c-generate?url=xx&code=xxx 自定义短链接生成地址,url要decode提交,代表要生成的地址,code长度小于7并且要以
>@开头后面跟大写字母小写字母数字的组合，列如@<br/>


### 访问流程
>1.生成短网址，获取code<br/>
>2.使用code进行访问,访问使用异步线程池保存访问记录,来统计点击次数<br/>
>3.通过修改字典和进制数可以修改编码的规则
```
//字典树
public static char[] chars ={
         'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
          '0','1','2','3','4','5','6','7','8','9',
          'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };
//字典的位数用于进制的转换
private static final int LENGTH = 62;
```

### 方案介绍
>短编码生成采用十进制递增的方式，控制编码的位数生成是取编码值转十进制的值的界限，比如两位编码:10-ZZ,对应的值是62-3843(根据你
编码的顺序不同N进制值会有区别)。不同的编码位数，维护不同区间的值，在程序启动的时候将各个区间的值加载到内存（分布式可以加载到redis）
,然后有新的N位数编码进来则在该区间+1，当该区间值到达阈值，则生成失败。

### 可优化方案
>1.生成的短地址可以使用redis做缓存减小数据库的压力<br/>
>2.混淆生成的字符码，防止遍历提高安全性


### sql
```$xslt
/*

Source Database       : shout_url
Date: 2019-04-17 15:45:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `link`
-- ----------------------------
DROP TABLE IF EXISTS `link`;
CREATE TABLE `link` (
  `link_id` varchar(64) NOT NULL,
  `url` varchar(128) NOT NULL DEFAULT '' COMMENT '长连接地址',
  `code` varchar(8) NOT NULL DEFAULT '' COMMENT '短地址码',
  `type` char(1) NOT NULL DEFAULT 's' COMMENT '地址类型:s 系统生成 c 自定义',
  `bits` tinyint(4) NOT NULL DEFAULT '7' COMMENT '短链接码位数',
  `dec_val` bigint(20) NOT NULL DEFAULT '0' COMMENT '码值的十进制值',
  `create_time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`link_id`),
  UNIQUE KEY `idx_code` (`code`) USING BTREE,
  UNIQUE KEY `idx_url` (`url`) USING BTREE,
  UNIQUE KEY `idx_dec_val` (`dec_val`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `link_history`
-- ----------------------------
DROP TABLE IF EXISTS `link_history`;
CREATE TABLE `link_history` (
  `id` varchar(64) NOT NULL,
  `link_id` varchar(64) NOT NULL DEFAULT '0' COMMENT '链接ID',
  `link_code` varchar(8) NOT NULL DEFAULT '' COMMENT '链接ocde',
  `link_url` varchar(128) NOT NULL DEFAULT '' COMMENT '链接url',
  `c_referer` varchar(128) NOT NULL DEFAULT '' COMMENT 'referer地址',
  `c_ip` varchar(18) NOT NULL DEFAULT '0' COMMENT '点击ip',
  `c_device` varchar(125) NOT NULL DEFAULT '' COMMENT '访问设备',
  `create_time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```

