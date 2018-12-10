package com.xunqi.mapper;

import com.xunqi.pojo.TebCollection;
import com.xunqi.pojo.TebCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TebCollectionMapper {
    int countByExample(TebCollectionExample example);

    int deleteByExample(TebCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TebCollection record);

    int insertSelective(TebCollection record);

    List<TebCollection> selectByExample(TebCollectionExample example);

    TebCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TebCollection record, @Param("example") TebCollectionExample example);

    int updateByExample(@Param("record") TebCollection record, @Param("example") TebCollectionExample example);

    int updateByPrimaryKeySelective(TebCollection record);

    int updateByPrimaryKey(TebCollection record);

	Integer selectIsCollection(TebCollection tebCollection);
}