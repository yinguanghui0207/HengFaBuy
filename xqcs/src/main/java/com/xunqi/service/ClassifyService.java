package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.Classify;

public interface ClassifyService {

	int insert(Classify classify);

	List<Classify> findDynClassify();

}
