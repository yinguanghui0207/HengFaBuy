package com.xunqi.controller;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/ali")
public class Alipay {

	@RequestMapping("/pay")
	@ResponseBody
	public ReturnResult alipay(){
		try {
			AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key","RSA2");
			AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
			String str = "{" +
					"\"timeout_express\":\"90m\"," +
					"\"total_amount\":\"TOTAL_AMOUNT\"," +
					"\"seller_id\":\"SELLER_ID\"," +
					"\"product_code\":\"QUICK_MSECURITY_PAY\"," +
					"\"body\":\"Iphone6 16G\"," +
					"\"subject\":\"大乐透\"," +
					"\"out_trade_no\":\"70501111111S001111119\"," +
					"\"time_expire\":\"2016-12-31 10:05\"," +
					"\"goods_type\":\"0\"," +
					"\"promo_params\":\"{\\\"storeIdType\\\":\\\"1\\\"}\"," +
					"\"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
					"\"royalty_info\":{" +
					"\"royalty_type\":\"ROYALTY\"," +
					"        \"royalty_detail_infos\":[{" +
					"          \"serial_no\":1," +
					"\"trans_in_type\":\"userId\"," +
					"\"batch_no\":\"123\"," +
					"\"out_relation_id\":\"20131124001\"," +
					"\"trans_out_type\":\"userId\"," +
					"\"trans_out\":\"2088101126765726\"," +
					"\"trans_in\":\"2088101126708402\"," +
					"\"amount\":0.1," +
					"\"desc\":\"分账测试1\"," +
					"\"amount_percentage\":\"100\"" +
					"          }]" +
					"    }," +
					"\"extend_params\":{" +
					"\"sys_service_provider_id\":\"2088511833207846\"," +
					"\"hb_fq_num\":\"3\"," +
					"\"hb_fq_seller_percent\":\"100\"," +
					"\"industry_reflux_info\":\"{\\\\\\\"scene_code\\\\\\\":\\\\\\\"metro_tradeorder\\\\\\\",\\\\\\\"channel\\\\\\\":\\\\\\\"xxxx\\\\\\\",\\\\\\\"scene_data\\\\\\\":{\\\\\\\"asset_name\\\\\\\":\\\\\\\"ALIPAY\\\\\\\"}}\"," +
					"\"card_type\":\"S0JP0000\"" +
					"    }," +
					"\"sub_merchant\":{" +
					"\"merchant_id\":\"19023454\"," +
					"\"merchant_type\":\"alipay: 支付宝分配的间连商户编号, merchant: 商户端的间连商户编号\"" +
					"    }," +
					"\"enable_pay_channels\":\"pcredit,moneyFund,debitCardExpress\"," +
					"\"store_id\":\"NJ_001\"," +
					"\"specified_channel\":\"pcredit\"," +
					"\"disable_pay_channels\":\"pcredit,moneyFund,debitCardExpress\"," +
					"\"settle_info\":{" +
					"        \"settle_detail_infos\":[{" +
					"          \"trans_in_type\":\"cardSerialNo\"," +
					"\"trans_in\":\"A0001\"," +
					"\"summary_dimension\":\"A0001\"," +
					"\"amount\":0.1" +
					"          }]" +
					"    }," +
					"\"invoice_info\":{" +
					"\"key_info\":{" +
					"\"is_support_invoice\":true," +
					"\"invoice_merchant_name\":\"ABC|003\"," +
					"\"tax_num\":\"1464888883494\"" +
					"      }," +
					"\"details\":\"[{\\\"code\\\":\\\"100294400\\\",\\\"name\\\":\\\"服饰\\\",\\\"num\\\":\\\"2\\\",\\\"sumPrice\\\":\\\"200.00\\\",\\\"taxRate\\\":\\\"6%\\\"}]\"" +
					"    }," +
					"\"ext_user_info\":{" +
					"\"name\":\"李明\"," +
					"\"mobile\":\"16587658765\"," +
					"\"cert_type\":\"IDENTITY_CARD\"," +
					"\"cert_no\":\"362334768769238881\"," +
					"\"min_age\":\"18\"," +
					"\"fix_buyer\":\"F\"," +
					"\"need_check_info\":\"F\"" +
					"    }," +
					"\"business_params\":\"{\\\"data\\\":\\\"123\\\"}\"" +
					"  }";
			
			str = str.replace("90", "0.01");
			request.setBizContent(str);
			AlipayTradeAppPayResponse response = alipayClient.pageExecute(request);
			if(response.isSuccess()){
			System.out.println("调用成功");
			} else {
			System.out.println("调用失败");
			}
			return  ReturnResult.success();
		} catch (Exception e) {
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	public ReturnResult aliPay(){
		//实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key","RSA2");
	//	AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
		model.setBody("我是测试数据");
		model.setSubject("App支付测试Java");
		model.setOutTradeNo("");
		model.setTimeoutExpress("30m");
		model.setTotalAmount("0.01");
		model.setProductCode("QUICK_MSECURITY_PAY");
		
		request.setBizModel(model);
		
		request.setNotifyUrl("商户外网可以访问的异步地址");
		try {
		        //这里和普通的接口调用不同，使用的是sdkExecute
		        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
		        System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
		        return  ReturnResult.success(response);
		    } catch (AlipayApiException e) {
//		        e.printStackTrace();
		    	return ReturnResult.error("01",e.getMessage());
		}
	}
}
