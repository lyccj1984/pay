package com.lyc.common;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAKey;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;

public class AlgorithmMy {

	public static String wxgetnonce_str(int len)
	{
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";  
        Random random = new Random();  
        StringBuffer sb = new StringBuffer();  
        for (int i = 0; i < len; i++) {  
            int number = random.nextInt(base.length());  
            sb.append(base.charAt(number));  
        }  
        return sb.toString();
	}
	/**
	 * 微信签名算法
	 * @param params
	 * @param mkey
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String wxgetsign(SortedMap<String,String> params,String mkey)
	{
		//第一步组合参数
		StringBuilder sb=new StringBuilder();
		Set es = params.entrySet();//所有参与传参的参数按照accsii排序（升序）  
        Iterator it = es.iterator();  
        while(it.hasNext()) {  
            Map.Entry entry = (Map.Entry)it.next();  
            String k = (String)entry.getKey();  
            Object v = entry.getValue();  
            if(null != v && !"".equals(v)   
                    && !"sign".equals(k) && !"key".equals(k)) {  
                sb.append(k + "=" + v + "&");  
            }  
        }  
		/*Set keyset=params.keySet();
		for (Object object : keyset) {
			 String k = (String)object;
		      Object v = params.get(k);
		      if(null != v && !"".equals(v) 
		          && !"sign".equals(k) && !"key".equals(k)) {
		        sb.append(k + "=" + v + "&");
		      }
		}*/

		//第二步：拼接API密钥
		sb.append("key=" + mkey);
		System.out.println("字符串拼接后是："+sb.toString());
	    String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8").toUpperCase();
		
		return sign;
	}

	/*public static String signAllString(String [] array){
		   StringBuffer sb = new StringBuffer("");
		   for (int i = 0; i < array.length; i++) {
		      if(i==(array.length-1)){
		         sb.append(array[i]);
		      }else{
		         sb.append(array[i]+"&");
		      }
		   }
		   System.out.println(sb.toString());
		   String sign = "";
		   try {
		      sign = URLEncoder.encode(RSAKey.sign(sb.toString(), AlipayConfig.private_key, "utf-8"), "utf-8");//private_key私钥
		   } catch (UnsupportedEncodingException e) {
		      e.printStackTrace();
		   }
		   sb.append("&sign=\""+sign+"\"&");
		   sb.append("sign_type=\"RSA\"");
		   return sb.toString();
		}*/

}
