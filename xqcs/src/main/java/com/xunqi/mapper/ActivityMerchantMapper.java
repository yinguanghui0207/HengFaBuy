package com.xunqi.mapper;

import com.xunqi.pojo.ActivityMerchant;
import com.xunqi.pojo.ActivityMerchantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMerchantMapper {
    int countByExample(ActivityMerchantExample example);

    int deleteByExample(ActivityMerchantExample example);

    int deleteByPrimaryKey(Integer merchantId);

    int insert(ActivityMerchant record);

    int insertSelective(ActivityMerchant record);

    List<ActivityMerchant> selectByExample(ActivityMerchantExample example);

    ActivityMerchant selectByPrimaryKey(Integer merchantId);

    int updateByExampleSelective(@Param("record") ActivityMerchant record, @Param("example") ActivityMerchantExample example);

    int updateByExample(@Param("record") ActivityMerchant record, @Param("example") ActivityMerchantExample example);

    int updateByPrimaryKeySelective(ActivityMerchant record);

    int updateByPrimaryKey(ActivityMerchant record);

	List<ActivityMerchant> selectByState(int state);
}