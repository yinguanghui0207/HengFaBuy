package com.xunqi.mapper;

import com.xunqi.pojo.ActivityInfo;
import com.xunqi.pojo.ActivityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityInfoMapper {
    int countByExample(ActivityInfoExample example);

    int deleteByExample(ActivityInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityInfo record);

    int insertSelective(ActivityInfo record);

    List<ActivityInfo> selectByExample(ActivityInfoExample example);

    ActivityInfo selectByPrimaryKey(Integer id);

    ActivityInfo selectByActivityId(Integer activityId);

    int updateByExampleSelective(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByExample(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByPrimaryKeySelective(ActivityInfo record);

    int updateByPrimaryKey(ActivityInfo record);
    
}