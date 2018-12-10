package com.xunqi.mapper;

import com.xunqi.pojo.XqActivity;
import com.xunqi.pojo.XqActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XqActivityMapper {
    int countByExample(XqActivityExample example);

    int deleteByExample(XqActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XqActivity record);

    int insertSelective(XqActivity record);

    List<XqActivity> selectByExample(XqActivityExample example);

    XqActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XqActivity record, @Param("example") XqActivityExample example);

    int updateByExample(@Param("record") XqActivity record, @Param("example") XqActivityExample example);

    int updateByPrimaryKeySelective(XqActivity record);

    int updateByPrimaryKey(XqActivity record);

	List<XqActivity> findAll();
	
	List<XqActivity> findByAddress(String address);
	
	List<XqActivity> findByKeyword(XqActivity xqActivity);

	XqActivity selectByActivityId(Integer activityId);

	List<XqActivity> findByPs(XqActivity xqActivity);

	List<XqActivity> selectByActivityIdList(@Param("activityIdList")List<Integer> activityIdList);

	int updateApplicantsNumByActivityId(Integer activityId);

	List<XqActivity> selectActivityByState(@Param("state")Integer state);

	int updateActivityState(XqActivity xqActivity);
	/**
	 * 根据经纬度查询附近距离
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> findByRange(@Param("record") XqActivity record, @Param("example") XqActivityExample example);

	List<XqActivity> findActivitySearch1(@Param("record") XqActivity record, @Param("example") XqActivityExample example);
	
	List<XqActivity> findActivitySearch3(@Param("record") XqActivity record, @Param("example") XqActivityExample example);
	
	List<XqActivity> findActivitySearch4(@Param("record") XqActivity record, @Param("example") XqActivityExample example);

	List<XqActivity> findActivityMoney(@Param("record") XqActivity record, @Param("example") XqActivityExample example);
	
	List<XqActivity> findActivityTime(@Param("record") XqActivity record, @Param("example") XqActivityExample example);

	int updateTaskState();

	List<XqActivity> findByActivityIds(@Param("ids") List<Integer> ids, @Param("example") XqActivityExample example);
	
	
	
}