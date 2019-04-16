package com.coffeezcat.shouturl.mapper;

import com.coffeezcat.shouturl.entity.LinkHistory;
import com.coffeezcat.shouturl.entity.LinkHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkHistoryMapper {
    int countByExample(LinkHistoryExample example);

    int deleteByExample(LinkHistoryExample example);

    int insert(LinkHistory record);

    int insertSelective(LinkHistory record);

    List<LinkHistory> selectByExample(LinkHistoryExample example);

    int updateByExampleSelective(@Param("record") LinkHistory record, @Param("example") LinkHistoryExample example);

    int updateByExample(@Param("record") LinkHistory record, @Param("example") LinkHistoryExample example);
}