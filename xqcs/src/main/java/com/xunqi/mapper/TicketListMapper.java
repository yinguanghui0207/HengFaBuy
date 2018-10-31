package com.xunqi.mapper;

import com.xunqi.pojo.TicketList;
import com.xunqi.pojo.TicketListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketListMapper {
    int countByExample(TicketListExample example);

    int deleteByExample(TicketListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketList record);

    int insertSelective(TicketList record);

    List<TicketList> selectByExample(TicketListExample example);

    TicketList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketList record, @Param("example") TicketListExample example);

    int updateByExample(@Param("record") TicketList record, @Param("example") TicketListExample example);

    int updateByPrimaryKeySelective(TicketList record);

    int updateByPrimaryKey(TicketList record);
    
    List<TicketList> selectByActivityId(Integer activityId);

	int updateTicketNumByTicketIdSelective(Integer ticketId);
}