package com.xunqi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.mapper.QrcodeMapper;
import com.xunqi.mapper.ReleaseStringMapper;
import com.xunqi.mapper.TicketListMapper;
import com.xunqi.mapper.TokenMapper;
import com.xunqi.mapper.XqActivityMapper;
import com.xunqi.mapper.XqActivityinfoMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.Data;
import com.xunqi.pojo.Qrcode;
import com.xunqi.pojo.ReleaseString;
import com.xunqi.pojo.TicketList;
import com.xunqi.pojo.XqActivity;
import com.xunqi.pojo.XqActivityinfo;
import com.xunqi.service.XqActivityinfoService;
@Service
public class XqActivityinfoServiceImpl implements XqActivityinfoService {
	
	@Autowired
	private XqActivityinfoMapper xqActivityinfoMapper;
	
	@Autowired
	private XqActivityMapper xqActivityMapper;
	
	@Autowired
	private ReleaseStringMapper releaseStringMapper ;
	
	@Autowired
	private QrcodeMapper qrcodeMapper ;
	@Autowired
	private TicketListMapper ticketListMapper ;
	@Autowired
	private ActivityUsrMapper activityUsrMapper ;
	@Autowired
	private TokenMapper tokenMapper;
	
	@Override
	public Data findAllByActivityId(Integer activityId) {
		Data data = new Data();
		XqActivity xqActivity = xqActivityMapper.selectByActivityId(activityId);
		
		data.setXqActivity(xqActivity);
	
		XqActivityinfo xqActivityinfo = xqActivityinfoMapper.selectByActivityId(activityId);
		data.setXqActivityinfo(xqActivityinfo);
		ReleaseString releaseString = releaseStringMapper.selectByActivityId(activityId);
		
		data.setReleaseString(releaseString);
		
		return data;
	}

	@Override
	public Integer findQrcode(String imei) {
		return qrcodeMapper.findQrcode(imei);
		
	}

	@Override
	public void insertQrcode(String imei) {
		Qrcode qrcode = new Qrcode();
		qrcode.setScene(imei);
		qrcodeMapper.insertSelective(qrcode);
		
	}

	@Override
	public void updateViewsNum(XqActivityinfo xqActivityinfo) {
		
		xqActivityinfoMapper.updateViewsNumByActivityId(xqActivityinfo.getActivityId());
	}

	@Override
	public void updateRelayNum(XqActivityinfo xqActivityinfo) {
		
		xqActivityinfoMapper.updateRelayNumByActivityId(xqActivityinfo.getActivityId());
		
	}

	@Override
	public List<Data> findReviewActivity(Integer state) {
		List<XqActivity> selectActivityByState = xqActivityMapper.selectActivityByState(state); 
		List<Data> list = new ArrayList<Data>();
		for(XqActivity x:selectActivityByState){
			Integer activityId =x.getActivityId();
			Data data = new Data();
			XqActivity xqActivity = xqActivityMapper.selectByActivityId(activityId);
			ActivityUsr selectByUseId = activityUsrMapper.selectByUseId(xqActivity.getPublisher());
			xqActivity.setPublisher(selectByUseId.getNickname());
			data.setXqActivity(xqActivity);		
			XqActivityinfo xqActivityinfo = xqActivityinfoMapper.selectByActivityId(activityId);
			data.setXqActivityinfo(xqActivityinfo);
			ReleaseString releaseString = releaseStringMapper.selectByActivityId(activityId);			
			data.setReleaseString(releaseString);	
			List<TicketList> selectByActivityId = ticketListMapper.selectByActivityId(activityId);
			data.setTicket(selectByActivityId);
			list.add(data);
		}
		return list;
	}

	@Override
	public String getToken() {
		return tokenMapper.getToken();
		
	}

}
