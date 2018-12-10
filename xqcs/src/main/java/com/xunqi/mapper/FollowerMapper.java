package com.xunqi.mapper;

import com.xunqi.pojo.Follower;
import com.xunqi.pojo.FollowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowerMapper {
    int countByExample(FollowerExample example);

    int deleteByExample(FollowerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Follower record);

    int insertSelective(Follower record);

    List<Follower> selectByExample(FollowerExample example);

    Follower selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Follower record, @Param("example") FollowerExample example);

    int updateByExample(@Param("record") Follower record, @Param("example") FollowerExample example);

    int updateByPrimaryKeySelective(Follower record);

    int updateByPrimaryKey(Follower record);

	int updateStateByUseId(Follower follower2);

}