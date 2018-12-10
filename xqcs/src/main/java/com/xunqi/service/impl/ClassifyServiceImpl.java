package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ClassifyMapper;
import com.xunqi.pojo.Classify;
import com.xunqi.pojo.ClassifyExample;
import com.xunqi.service.ClassifyService;
@Service
public class ClassifyServiceImpl implements ClassifyService {
	@Autowired
	private ClassifyMapper classifyMapper;

	@Override
	public int insert(Classify classify) {
		
		classify.setCreateTime(new Date());
		return classifyMapper.insertSelective(classify);
	}

	@Override
	public List<Classify> findDynClassify() {
		ClassifyExample example = new ClassifyExample();
		ClassifyExample.Criteria criteria = example.createCriteria();
		criteria.andClassifyStateEqualTo(0);
		criteria.andClassifyTypeEqualTo(1);
		
		List<Classify> selectByExample = classifyMapper.selectByExample(example);
		return selectByExample;
	}
}
