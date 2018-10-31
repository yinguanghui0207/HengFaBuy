package com.xunqi.mapper;

import com.xunqi.pojo.ActivityDetails;
import com.xunqi.pojo.ActivityDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityDetailsMapper {
    int countByExample(ActivityDetailsExample example);

    int deleteByExample(ActivityDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDetails record);

    int insertSelective(ActivityDetails record);

    ActivityDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDetails record, @Param("example") ActivityDetailsExample example);

    int updateByExample(@Param("record") ActivityDetails record, @Param("example") ActivityDetailsExample example);

    int updateByPrimaryKeySelective(ActivityDetails record);

    int updateByPrimaryKey(ActivityDetails record);
    
    List<ActivityDetails> selectByActivityId(Integer activityId);
}