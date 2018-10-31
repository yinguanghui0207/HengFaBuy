package com.xunqi.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class PropertyService {
		

		@Value("${REPOSITORY_PATH}")  
		public String REPOSITORY_PATH;
		@Value("${IMAGE_BASE_URL}")
		public String IMAGE_BASE_URL;
		@Value("${WXEWM_PATH}")
		public String WXEWM_PATH;
		
	

}
