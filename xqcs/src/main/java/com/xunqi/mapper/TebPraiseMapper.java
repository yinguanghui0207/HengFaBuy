package com.xunqi.mapper;

import com.xunqi.pojo.TebPraise;
import com.xunqi.pojo.TebPraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TebPraiseMapper {
    int countByExample(TebPraiseExample example);

    int deleteByExample(TebPraiseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TebPraise record);

    int insertSelective(TebPraise record);

    List<TebPraise> selectByExample(TebPraiseExample example);

    TebPraise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TebPraise record, @Param("example") TebPraiseExample example);

    int updateByExample(@Param("record") TebPraise record, @Param("example") TebPraiseExample example);

    int updateByPrimaryKeySelective(TebPraise record);

    int updateByPrimaryKey(TebPraise record);

	Integer selectIspraise(TebPraise tebPraise);
}