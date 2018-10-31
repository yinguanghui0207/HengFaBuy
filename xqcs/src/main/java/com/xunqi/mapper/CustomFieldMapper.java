package com.xunqi.mapper;

import com.xunqi.pojo.CustomField;
import com.xunqi.pojo.CustomFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomFieldMapper {
    int countByExample(CustomFieldExample example);

    int deleteByExample(CustomFieldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomField record);

    int insertSelective(CustomField record);

    List<CustomField> selectByExample(CustomFieldExample example);

    CustomField selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomField record, @Param("example") CustomFieldExample example);

    int updateByExample(@Param("record") CustomField record, @Param("example") CustomFieldExample example);

    int updateByPrimaryKeySelective(CustomField record);

    int updateByPrimaryKey(CustomField record);
}