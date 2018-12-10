package com.xunqi.mapper;

import com.xunqi.pojo.CircleMessage;
import com.xunqi.pojo.CircleMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleMessageMapper {
    int countByExample(CircleMessageExample example);

    int deleteByExample(CircleMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CircleMessage record);

    int insertSelective(CircleMessage record);

    List<CircleMessage> selectByExample(CircleMessageExample example);

    CircleMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CircleMessage record, @Param("example") CircleMessageExample example);

    int updateByExample(@Param("record") CircleMessage record, @Param("example") CircleMessageExample example);

    int updateByPrimaryKeySelective(CircleMessage record);

    int updateByPrimaryKey(CircleMessage record);

	List<CircleMessage> selectByRange(@Param("record") CircleMessage record, @Param("example") CircleMessageExample example);
	/**
	 * 通过useid集合查询消息 
	 * @param useIdList
	 * @param example
	 * @return
	 */
	List<CircleMessage> selectByuseIdList(@Param("useIdList")List<String>useIdList, @Param("example") CircleMessageExample example);

	int updateMsgviewByPrimaryKey(Integer id);

	int updateMsgreplyByPrimaryKey(Integer id);

	int updateMsgpraiseByPrimaryKey(Integer id);

	int updateMsgpraise1ByPrimaryKey(Integer id);

	List<CircleMessage> findByMsgIds(@Param("ids") List<Integer> ids,@Param("example") CircleMessageExample example);
	
	
	
}