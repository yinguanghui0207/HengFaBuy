package com.xunqi.mapper;

import com.xunqi.pojo.XqActivityinfo;
import com.xunqi.pojo.XqActivityinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XqActivityinfoMapper {
    int countByExample(XqActivityinfoExample example);

    int deleteByExample(XqActivityinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XqActivityinfo record);

    int insertSelective(XqActivityinfo record);

    List<XqActivityinfo> selectByExample(XqActivityinfoExample example);

    XqActivityinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XqActivityinfo record, @Param("example") XqActivityinfoExample example);

    int updateByExample(@Param("record") XqActivityinfo record, @Param("example") XqActivityinfoExample example);

    int updateByPrimaryKeySelective(XqActivityinfo record);

    int updateByPrimaryKey(XqActivityinfo record);

	XqActivityinfo selectByActivityId(Integer activityId);

	int updateByActivityId(XqActivityinfo xqActivityinfo);

	int updateRelayNumByActivityId(Integer activityId);

	int updateViewsNumByActivityId(Integer activityId);

	
}