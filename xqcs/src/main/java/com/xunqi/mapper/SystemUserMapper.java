package com.xunqi.mapper;

import com.xunqi.pojo.SystemUser;
import com.xunqi.pojo.SystemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUserMapper {
    int countByExample(SystemUserExample example);

    int deleteByExample(SystemUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    List<SystemUser> selectByExample(SystemUserExample example);

    SystemUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);
    
    SystemUser selectByAP(SystemUser record);

	int updatePasswordByAccount(SystemUser systemUser);
	
	Integer findoneSystemUser(String account);
	
	int updateState(SystemUser systemUser);

	List<SystemUser> selectAllUser();
}