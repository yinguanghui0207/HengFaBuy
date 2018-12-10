package com.xunqi.mapper;

import com.xunqi.pojo.TebReply;
import com.xunqi.pojo.TebReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TebReplyMapper {
    int countByExample(TebReplyExample example);

    int deleteByExample(TebReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TebReply record);

    int insertSelective(TebReply record);

    List<TebReply> selectByExample(TebReplyExample example);

    TebReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TebReply record, @Param("example") TebReplyExample example);

    int updateByExample(@Param("record") TebReply record, @Param("example") TebReplyExample example);

    int updateByPrimaryKeySelective(TebReply record);

    int updateByPrimaryKey(TebReply record);
}