package com.xunqi.pojo;

import java.util.List;

public class Data {
	 XqActivity xqActivity=new XqActivity();
	 
	 XqActivityinfo  xqActivityinfo= new XqActivityinfo();
	 
	 List<TicketList> ticket ;
	 
	 ReleaseString releaseString = new ReleaseString();

	public XqActivity getXqActivity() {
		return xqActivity;
	}

	public void setXqActivity(XqActivity xqActivity) {
		this.xqActivity = xqActivity;
	}

	public XqActivityinfo getXqActivityinfo() {
		return xqActivityinfo;
	}

	public void setXqActivityinfo(XqActivityinfo xqActivityinfo) {
		this.xqActivityinfo = xqActivityinfo;
	}

	public List<TicketList> getTicket() {
		return ticket;
	}

	public void setTicket(List<TicketList> ticket) {
		this.ticket = ticket;
	}

	public ReleaseString getReleaseString() {
		return releaseString;
	}

	public void setReleaseString(ReleaseString releaseString) {
		this.releaseString = releaseString;
	}
	

	
	 
}
