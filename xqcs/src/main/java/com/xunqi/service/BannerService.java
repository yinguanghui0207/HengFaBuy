package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.Banner;

public interface BannerService {

	int insertBanner(Banner banner);

	List<Banner> findBannerByState(Banner banner);

}
