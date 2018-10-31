package com.xunqi.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xunqi.pojo.WxCode;
import com.xunqi.service.XqActivityinfoService;
import com.xunqi.tool.AgentDTO;
import com.xunqi.tool.AgentReqView;
import com.xunqi.tool.HttpClientConnectionManager;
import com.xunqi.tool.OssClienUtils;


@Controller
@RequestMapping("/pic")
public class GetWxImg {
//	@Autowired
//	private PropertyService propertyService;
	@Autowired
	private XqActivityinfoService xqActivityinfoService;
	
	/*@RequestMapping(value = "/createwxaqrcode1")
	@ResponseBody
	public Object  createwxaqrcode(@RequestBody WxCode wxCode ){
		AgentDTO agentDTO = new AgentDTO();
//		OssClienUtils ossClient = new OssClienUtils();
		try { 
		//查询二维码是否存在
		String imei = wxCode.getScene() ;
		String name = imei+".png";
		 String downloadfileUrl = propertyService.IMAGE_BASE_URL + "/images/" + name;
//		 String imgUrl = ossClient.getImgUrl(name);
		 Integer findQrcode = xqActivityinfoService.findQrcode(imei);
		 Integer a =1;
		 if(a.equals(findQrcode)){
			 AgentReqView agentResView = new AgentReqView();			
			agentResView.setDownloadfileUrl(downloadfileUrl);
	            agentDTO.setResultCode("200");
	            agentDTO.setDesc("二维码已生成");
	            agentDTO.setBody(agentResView);
	            return agentDTO;
		}else{
			xqActivityinfoService.insertQrcode(imei);
		}
		String access_token =getAccessToken();
		//二维码图片位置
		Random ran = new Random();
		String imei = ""+System.currentTimeMillis() +ran.nextInt(10) ;
		
		
		String agentImgDownloadUrl = propertyService.REPOSITORY_PATH+"/images/";
	//	String agentImgDownloadUrl = "src/main/webapp/images/";
         
        	AgentReqView agentResView = new AgentReqView();
        	Map<String, Object> map = new HashMap<String, Object>();
    	    map.put("path", wxCode.getPage());
    	    map.put("width", wxCode.getWidth());
    	    map.put("scene", wxCode.getScene());
    	    map.put("is_hyaline",false);//是否要白色背景
    	    
//            JSONObject json = JSONObject.parseObject(JSON.toJSONString(map));
            
            CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+access_token);
            
            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
            String body = JSON.toJSONString(map);           //必须是json模式的 post      
            StringEntity entity;
            entity = new StringEntity(body);
            entity.setContentType("image/png");

            httpPost.setEntity(entity);
            HttpResponse response;

            response = httpClient.execute(httpPost);
            InputStream inputStream = response.getEntity().getContent();
         //   String name = imei+".png";
         //   ossClient.uploadFile2OSS(inputStream,name);
           saveToImgByInputStream(inputStream,agentImgDownloadUrl,name); //保存图片
     //           saveToImgByInputStream(inputStream,agentImgDownloadUrl,name); //保存图片
            
            //String downloadUrl = agentImgDownloadUrl+"/";
            //返回给前端的后台服务器文件下载路径
    //        String downloadfileUrl = downloadUrl +name;
            //String _dir1 = "/images/" + new SimpleDateFormat("yyyy/MM/dd").format(new Date())+"/";
        //     String downloadfileUrl = propertyService.IMAGE_BASE_URL + "/images/" + name;
            agentResView.setDownloadfileUrl(downloadfileUrl);
            agentDTO.setResultCode("200");
            agentDTO.setDesc("成功");
            agentDTO.setBody(agentResView);
            
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        return agentDTO;
	}*/
	
	@RequestMapping(value = "/createwxaqrcode")
	@ResponseBody
	public Object  createwxaqrcode1(@RequestBody WxCode wxCode ){
		AgentDTO agentDTO = new AgentDTO();
		OssClienUtils ossClient = new OssClienUtils();
		try { 
		//查询二维码是否存在
		String imei = wxCode.getScene() ;
		String name = imei+".png";
		 String imgUrl = ossClient.getImgUrl(name);
		 Integer findQrcode = xqActivityinfoService.findQrcode(imei);
		 Integer a =1;
		 if(a.equals(findQrcode)){
			 AgentReqView agentResView = new AgentReqView();			
			agentResView.setDownloadfileUrl(imgUrl);
	            agentDTO.setResultCode("200");
	            agentDTO.setDesc("二维码已生成");
	            agentDTO.setBody(agentResView);
	            return agentDTO;
		}else{
			xqActivityinfoService.insertQrcode(imei);
		}
		String access_token =getAccessToken();
		
		
         
        	AgentReqView agentResView = new AgentReqView();
        	Map<String, Object> map = new HashMap<String, Object>();
    	    map.put("page", wxCode.getPage());
    	    map.put("width", wxCode.getWidth());
    	    map.put("scene", wxCode.getScene());
    	    map.put("is_hyaline",false);//是否要白色背景
    	    

            
            CloseableHttpClient  httpClient = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+access_token);
            
            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
            String body = JSON.toJSONString(map);           //必须是json模式的 post      
            StringEntity entity;
            entity = new StringEntity(body);
            entity.setContentType("image/png");

            httpPost.setEntity(entity);
            HttpResponse response;

            response = httpClient.execute(httpPost);
            InputStream inputStream = response.getEntity().getContent();
         
           ossClient.uploadFile2OSS11(inputStream,name);                    
            agentResView.setDownloadfileUrl(imgUrl);
            agentDTO.setResultCode("200");
            agentDTO.setDesc("成功");
            agentDTO.setBody(agentResView);
            
            
        } catch (Exception e) {  
            e.printStackTrace();  
        }finally{
			ossClient.destory();
		}
        return agentDTO;
	}
	
	
 
	
    public String getAccessToken() {
        try {
        	String appId ="wx8d167b0362172830";
        	String appsecret ="031576620752be50bc76479874791205";
            String url = "https://api.weixin.qq.com/cgi-bin/token";
            String param ="grant_type=client_credential&appid=APPID&secret=APPSECRET";
            param = param.replace("APPID", appId).replace("APPSECRET", appsecret);
            String result = HttpClientConnectionManager.sendGet(url, param);
            JSONObject json = JSONObject.parseObject(result);
             return  json.get("access_token").toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "获取失败";
        }
    }


     /**
     * 将二进制转换成文件保存
     * @param instreams 二进制流
     * @param imgPage 图片的保存路径
     * @param imgName 图片的名称
     * @return 
     *      1：保存正常
     *      0：保存失败
     */
    public static int saveToImgByInputStream(InputStream instreams,String imgPage,String imgName){
        int stateInt = 1;
        if(instreams != null){
            try {
                File file=new File(imgPage,imgName);//可以是任何图片格式.jpg,.png等
                FileOutputStream fos=new FileOutputStream(file);
                byte[] b = new byte[1024];
                int nRead = 0;
                while ((nRead = instreams.read(b)) != -1) {
                    fos.write(b, 0, nRead);
                }
                fos.flush();
                fos.close();                
            } catch (Exception e) {
                stateInt = 0;
                e.printStackTrace();
            } finally {
            }
        }
        return stateInt;
    }
}

