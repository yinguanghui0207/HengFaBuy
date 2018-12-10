package com.xunqi.mapper;

import com.xunqi.pojo.UseImages;
import com.xunqi.pojo.UseImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseImagesMapper {
    int countByExample(UseImagesExample example);

    int deleteByExample(UseImagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UseImages record);

    int insertSelective(UseImages record);

    List<UseImages> selectByExample(UseImagesExample example);

    UseImages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UseImages record, @Param("example") UseImagesExample example);

    int updateByExample(@Param("record") UseImages record, @Param("example") UseImagesExample example);

    int updateByPrimaryKeySelective(UseImages record);

    int updateByPrimaryKey(UseImages record);

	List<UseImages> findByids(@Param("ids")List<Integer> ids, @Param("example")UseImagesExample example);
}