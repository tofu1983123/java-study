package org.wyzc.elt.entity;

import java.io.Serializable;

/**
 * ��װ����������Ϣ,����Ҫ�������д���,����Ҫʵ�����л��ӿ�
 * @author Administrator
 *
 */
public class Request implements Serializable {
	//����Ҫ���͵�����(��ʵ���Ƿ������˵���ҵ������Ҫ�Ĳ���)
	private Object[] obj;
	//��������ȡ�����Ĳ���
	private Class[] paramTypes;
	//�������˵��÷���������
	private String methodName;
	//�û���Ψһ��ʶ
	private String sessionId;
	public Request(){}
	public Request(Object[] obj, Class[] paramTypes, String methodName) {
		super();
		this.obj = obj;
		this.paramTypes = paramTypes;
		this.methodName = methodName;
	}
	public Object[] getObj() {
		return obj;
	}
	public void setObj(Object[] obj) {
		this.obj = obj;
	}
	public Class[] getParamTypes() {
		return paramTypes;
	}
	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
