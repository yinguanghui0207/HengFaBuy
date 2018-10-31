package com.xunqi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.CustomFieldMapper;
import com.xunqi.pojo.CustomField;
import com.xunqi.service.CustomFieldService;
	@Service
	public class CustomFieldServiceImpl implements CustomFieldService{
		
		@Autowired
		private CustomFieldMapper customFieldMapper;
		@Override
		public int insertField(CustomField customField) {
			
			return 	customFieldMapper.insertSelective(customField);
		}

	}
