package org.wyzc.elt.entity;

import java.io.Serializable;

public class Response implements Serializable{
	private Exception exception;//�쳣,�����ڿͻ�����ʾ�쳣��Ϣ
	private Object obj;//�������˷��ص�����
	private boolean isSuccess;
	private String sessionId;
	public Response(){}
	public Response(Exception exception, Object obj, boolean isSuccess) {
		super();
		this.exception = exception;
		this.obj = obj;
		this.isSuccess = isSuccess;
	}
	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess() {
		this.isSuccess = this.exception == null;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
}
