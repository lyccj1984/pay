package com.lyc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AlipayPubPar {


	public String app_id; // ֧��������������ߵ�Ӧ��ID y
	public String method; // �ӿ����� y
	public String format; // ��֧��JSON n
	public String charset; // ����ʹ�õı����ʽ����utf-8,gbk,gb2312�� y
	public String sign_type; // �̻�����ǩ���ַ�����ʹ�õ�ǩ���㷨���ͣ�Ŀǰ֧��RSA2��RSA���Ƽ�ʹ��RSA2 y
	public String sign; // �̻����������ǩ���������ǩ�� y
	public String timestamp; // ���������ʱ�䣬��ʽ"yyyy-MM-dd HH:mm:ss" y
	public String version; // ���õĽӿڰ汾���̶�Ϊ��1.0 y
	public String notify_url; // ֧��������������֪ͨ�̻���������ָ����ҳ�� N
	public String app_auth_token; // ���Ӧ����Ȩ���� N
	public String biz_content; // ��������ļ��ϣ���󳤶Ȳ��ޣ�����������������������������������������д��ݣ�������ո���Ʒ���ٽ����ĵ�N

	

}
