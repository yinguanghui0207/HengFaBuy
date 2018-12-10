package com.xunqi.mapper;

import com.xunqi.pojo.TebFootprint;
import com.xunqi.pojo.TebFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TebFootprintMapper {
    int countByExample(TebFootprintExample example);

    int deleteByExample(TebFootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TebFootprint record);

    int insertSelective(TebFootprint record);

    List<TebFootprint> selectByExample(TebFootprintExample example);

    TebFootprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TebFootprint record, @Param("example") TebFootprintExample example);

    int updateByExample(@Param("record") TebFootprint record, @Param("example") TebFootprintExample example);

    int updateByPrimaryKeySelective(TebFootprint record);

    int updateByPrimaryKey(TebFootprint record);
    /**
     * 查询是否有此足迹
     * @param record
     * @return
     */
    Integer selectIsFootprint(TebFootprint record);
}