package com.xunqi.controller;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.xunqi.pojo.PicUploadResult;
import com.xunqi.tool.OssClienUtils;
	@Controller
	@RequestMapping("/aly/aliyun")
	public class ALiYunOSSController {

	    @RequestMapping("/headImgUpload")
	    @ResponseBody
	    public PicUploadResult headImgUpload(@RequestParam(value = "file", required = false)MultipartFile file) {
	    	PicUploadResult result = new PicUploadResult();
	    	 OssClienUtils ossClient = new OssClienUtils();
	    	try {
	    		
		    	BufferedImage image = ImageIO.read(file.getInputStream());
				result.setHeight(""+image.getHeight());
				result.setWidth(""+image.getWidth());
		        if (file == null || file.getSize() <= 0) {
		            throw new Exception("图片不能为空");
		        }
		        String  nameHz= file.getOriginalFilename(); //上传的文件名 + 后缀    如  asd.png
		        String type = "";
		        if(nameHz.matches("^(?i).*?\\.(jpg|png|gif|bmp)$")){
		            type="/img";
		        }
		        else if(nameHz.contains(".mp4") || nameHz.contains(".ogv")){
		            type="/video";
		        }else {
		            type="/file";
		        }
		       
		        String keyName = ossClient.uploadImg2Oss(file,type);
		        String imgUrl = ossClient.getImgUrl(keyName);
		        result.setUrl(imgUrl);	
		        
			}catch (Exception e) {
				result.setError(1);	
				e.printStackTrace();
			}finally{
				ossClient.destory();
			}
	    	return result;
	    }	    
	   
	}

