package com.xunqi.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.xunqi.pojo.PicUploadResult;
import com.xunqi.service.impl.PropertyService;
@Controller
public class PicUpload {
	
	@Autowired
	private PropertyService propertyService;
	//阿里云API的内或外网域名
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public PicUploadResult upload(@RequestParam(value = "file", required = false)MultipartFile uploadFile){
		
		
		PicUploadResult result = new PicUploadResult();
	
		String fileName = uploadFile.getOriginalFilename();
		String extName = fileName.substring(fileName.lastIndexOf("."));
		
		
		if(!fileName.matches("^(?i).*?\\.(jpg|png|gif|bmp)$")){
			result.setError(1);
		}else{
			
			try {
		
				
				BufferedImage image = ImageIO.read(uploadFile.getInputStream());
				result.setHeight(""+image.getHeight());
				result.setWidth(""+image.getWidth());
				
				
				Random ran = new Random();
				String newFileName = ""+System.currentTimeMillis() +ran.nextInt(10) + extName;
				String _dir1 = "/images/" + new SimpleDateFormat("yyyy/MM/dd").format(new Date())+"/";
//				String _dir = "src/main/webapp/images/" + new SimpleDateFormat("yyyy/MM/dd").format(new Date())+"/";
//				String path =_dir;
				String path = propertyService.REPOSITORY_PATH + _dir1;
			
				//http://image.jt.com/images/2017/06/12/239847293874.jpg
				String url = propertyService.IMAGE_BASE_URL + _dir1 + newFileName;
		
			
			result.setUrl(url);				
				File dir = new File(path); 
				if(!dir.exists()){	
					dir.mkdirs();	
				}
				uploadFile.transferTo(new File(path+newFileName));
//				File filess=new File(path+newFileName);  
			} catch (IOException e) {
				result.setError(1);	
				e.printStackTrace();
			}
		}
		return result;
	}
}
