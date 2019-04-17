
##短网址服务
### 短网址服务访问 
>1.localhost:port/{code} 短链接服务地址<br/>
>2.localhost:port/generate?url=xx&bit=x 短链接生成地址,url要decode提交,代表要生成的地址,bit代表要生成的位数

### 访问流程
>1.生成短网址，获取code<br/>
>2.使用code进行访问,访问使用异步线程池保存访问记录

### 方案介绍
>短编码生成采用十进制递增的方式，控制编码的位数生成是取编码值转十进制的值的界限，比如两位编码:10~ZZ,对应的值是62~3843(根据你
编码的顺序不同N进制值会有区别)。不同的编码位数，维护不同区间的值，在程序启动的时候将各个区间的值加载到内存（分布式可以加载到redis）
,然后有新的N位数编码进来则在该区间+1，当该区间值到达阈值，则生成失败。
### 可优化方案
>1.生成的短地址可以使用redis做缓存减小数据库的压力<br/>
>2.混淆生成的字符码，防止遍历提高安全性

