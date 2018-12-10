package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.UseImagesMapper;
import com.xunqi.pojo.UseImages;
import com.xunqi.pojo.UseImagesExample;
import com.xunqi.service.UseImagesService;
@Service
public class UseImagesServiceImpl implements UseImagesService{
	
	@Autowired
	private UseImagesMapper useImagesMapper;


	@Override
	public UseImages insertUseImages(UseImages useImages) {
		
		useImages.setCreateTime(new Date());
		useImagesMapper.insertSelective(useImages);
		return useImages;
	}

	@Override
	public List<UseImages> findUseImagesByStateAndUseId(UseImages useImages) {
		UseImagesExample useImagesExample = new UseImagesExample();
		UseImagesExample.Criteria criteria = useImagesExample.createCriteria();
		criteria.andStateEqualTo(useImages.getState());
		criteria.andUseIdEqualTo(useImages.getUseId());
		
		useImages.setCreateTime(new Date());
		List<UseImages> selectByExample = useImagesMapper.selectByExample(useImagesExample);
		return selectByExample;
	}

	@Override
	public int updateUseImages(UseImages useImages) {
		useImages.setUpdateTime(new Date());
		int updateByPrimaryKeySelective = useImagesMapper.updateByPrimaryKeySelective(useImages);
		return updateByPrimaryKeySelective;
	}

	@Override
	public List<UseImages> findByids(List<Integer> ids, int page) {
		UseImagesExample example = new UseImagesExample();
		example.setPageNum(page);
		example.setPageSize(8);
		return useImagesMapper.findByids(ids,example);
	}
	
}
