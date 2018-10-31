package com.xunqi.mapper;

import com.xunqi.pojo.ActivityCollection;
import com.xunqi.pojo.ActivityCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCollectionMapper {
    int countByExample(ActivityCollectionExample example);

    int deleteByExample(ActivityCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCollection record);

    int insertSelective(ActivityCollection record);

    List<ActivityCollection> selectByExample(ActivityCollectionExample example);

    ActivityCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityCollection record, @Param("example") ActivityCollectionExample example);

    int updateByExample(@Param("record") ActivityCollection record, @Param("example") ActivityCollectionExample example);

    int updateByPrimaryKeySelective(ActivityCollection record);

    int updateByPrimaryKey(ActivityCollection record);

	List<ActivityCollection> selectByActivityId(Integer activityId);

	List<ActivityCollection> selectByUserId(String useId);
}