package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.TebFootprint;

public interface TebFootprintService {
	/**
	 * 加入足迹 footPrintId 足迹 useId type
	 * @param tebFootprint
	 * @return
	 */
	int insertTebFootprint(TebFootprint tebFootprint);
	/**
	 * 查询足迹信息
	 * @param tebFootprint
	 * @return
	 */
	List<TebFootprint> findFootprint(TebFootprint tebFootprint);
}
