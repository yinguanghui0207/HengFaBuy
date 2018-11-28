package com.xunqi.mapper;

import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.ActivityUsrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityUsrMapper {
    int countByExample(ActivityUsrExample example);

    int deleteByExample(ActivityUsrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityUsr record);

    int insertSelective(ActivityUsr record);

    List<ActivityUsr> selectByExample(ActivityUsrExample example);

    ActivityUsr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityUsr record, @Param("example") ActivityUsrExample example);

    int updateByExample(@Param("record") ActivityUsr record, @Param("example") ActivityUsrExample example);

    int updateByPrimaryKeySelective(ActivityUsr record);

    int updateByPrimaryKey(ActivityUsr record);
    
   int updateByUseIdSelective(ActivityUsr record);
    
    ActivityUsr selectByPortrait(String portrait);

	List<ActivityUsr> selectByUserIdList(@Param("useIdList")List<String>useIdList);
	
	List<ActivityUsr> selectPhone(String isCompany);
	
	ActivityUsr selectByUseId(String useId);
	
	
}