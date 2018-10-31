package com.xunqi.mapper;

import com.xunqi.pojo.ReleaseString;
import com.xunqi.pojo.ReleaseStringExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaseStringMapper {
    int countByExample(ReleaseStringExample example);

    int deleteByExample(ReleaseStringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReleaseString record);

    int insertSelective(ReleaseString record);

    List<ReleaseString> selectByExample(ReleaseStringExample example);

    ReleaseString selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReleaseString record, @Param("example") ReleaseStringExample example);

    int updateByExample(@Param("record") ReleaseString record, @Param("example") ReleaseStringExample example);

    int updateByPrimaryKeySelective(ReleaseString record);

    int updateByPrimaryKey(ReleaseString record);

	ReleaseString selectByActivityId(Integer activityId);
}