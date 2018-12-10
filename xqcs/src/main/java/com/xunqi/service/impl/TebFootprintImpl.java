package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.TebFootprintMapper;
import com.xunqi.pojo.TebFootprint;
import com.xunqi.pojo.TebFootprintExample;
import com.xunqi.service.TebFootprintService;
@Service
public class TebFootprintImpl implements TebFootprintService{
	@Autowired
	private TebFootprintMapper tebFootprintMapper;

	@Override
	public int insertTebFootprint(TebFootprint tebFootprint) {
		Integer selectIsFootprint = tebFootprintMapper.selectIsFootprint(tebFootprint);
		if(1 == selectIsFootprint){
			TebFootprintExample example = new TebFootprintExample();
			TebFootprintExample.Criteria criteria = example.createCriteria();
			criteria.andFootprintIdEqualTo(tebFootprint.getFootprintId());
			criteria.andUseIdEqualTo(tebFootprint.getUseId());
			criteria.andTypeEqualTo(tebFootprint.getType());
			tebFootprint.setCreateTime(new Date());
			return tebFootprintMapper.updateByExampleSelective(tebFootprint, example);
		}else{
			
			return tebFootprintMapper.insertSelective(tebFootprint);
		}
		
	}

	@Override
	public List<TebFootprint> findFootprint(TebFootprint tebFootprint) {
		TebFootprintExample example = new TebFootprintExample();
		TebFootprintExample.Criteria criteria = example.createCriteria();
		criteria.andUseIdEqualTo(tebFootprint.getUseId());
		criteria.andTypeEqualTo(tebFootprint.getType());		
		return tebFootprintMapper.selectByExample(example);
	}
}
