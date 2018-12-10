package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.UseImages;

public interface UseImagesService {
	/**
	 * 插入图册信息
	 * @param useImages
	 * @return
	 */
	UseImages insertUseImages(UseImages useImages);

	List<UseImages> findUseImagesByStateAndUseId(UseImages useImages);

	int updateUseImages(UseImages useImages);

	List<UseImages> findByids(List<Integer> ids, int page);

}
