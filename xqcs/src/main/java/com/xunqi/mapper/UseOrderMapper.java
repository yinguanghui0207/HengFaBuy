package com.xunqi.mapper;

import com.xunqi.pojo.UseOrder;
import com.xunqi.pojo.UseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseOrderMapper {
    int countByExample(UseOrderExample example);

    int deleteByExample(UseOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UseOrder record);

    int insertSelective(UseOrder record);

    List<UseOrder> selectByExample(UseOrderExample example);

    UseOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UseOrder record, @Param("example") UseOrderExample example);

    int updateByExample(@Param("record") UseOrder record, @Param("example") UseOrderExample example);

    int updateByPrimaryKeySelective(UseOrder record);

    int updateByPrimaryKey(UseOrder record);

	List<UseOrder> findOrderByActivityId(Integer activityId);

	List<UseOrder> findOrderByUseId(String useId);

	List<UseOrder> findOrderByUseIdAndS(UseOrder useOrder);

	UseOrder selectByTicketNo(String ticketNo);

	int updateByTicketNo(UseOrder useOrder);
	/**
	 * 更改订单状态为2
	 * @return
	 */
	int updateTaskState();
	/**
	 * 更改订单状态为3和票的状态为1
	 * @return
	 */
	int updateTaskOrderState();
}