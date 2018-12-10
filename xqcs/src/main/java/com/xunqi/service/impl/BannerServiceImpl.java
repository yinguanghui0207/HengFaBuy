package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.BannerMapper;
import com.xunqi.pojo.Banner;
import com.xunqi.pojo.BannerExample;
import com.xunqi.service.BannerService;
@Service
public class BannerServiceImpl implements BannerService {
	@Autowired
	private BannerMapper bannerMapper;

	@Override
	public int insertBanner(Banner banner) {
		banner.setCreateTime(new Date());
		return bannerMapper.insertSelective(banner);
		
	}

	@Override
	public List<Banner> findBannerByState(Banner banner) {
		BannerExample bannerExample = new BannerExample();
		BannerExample.Criteria criteria = bannerExample.createCriteria();
		criteria.andStateEqualTo(banner.getState());
		List<Banner> selectByExample = bannerMapper.selectByExample(bannerExample);
		return selectByExample; 
	}
}
 