package cn.wyzc.bbs.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String loginName;
	private String nickName;
	private String password;
	private String email;
	private String gender;
	private Date registrationTime;
	private Date lastVisitTime;
	private String lastVisitIpAddr;
	private int topicCount;
	private int articleCount;
	private boolean isLock;
	private String autoLoginAuthKey;
	//���û���ӵ�еĽ�ɫ
	private Set<Role> roles = new HashSet<Role>();
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getRegistrationTime() {
		return registrationTime;
	}
	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}
	public Date getLastVisitTime() {
		return lastVisitTime;
	}
	public void setLastVisitTime(Date lastVisitTime) {
		this.lastVisitTime = lastVisitTime;
	}
	public String getLastVisitIpAddr() {
		return lastVisitIpAddr;
	}
	public void setLastVisitIpAddr(String lastVisitIpAddr) {
		this.lastVisitIpAddr = lastVisitIpAddr;
	}
	public int getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}
	public int getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}
	public boolean isLock() {
		return isLock;
	}
	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}
	public String getAutoLoginAuthKey() {
		return autoLoginAuthKey;
	}
	public void setAutoLoginAuthKey(String autoLoginAuthKey) {
		this.autoLoginAuthKey = autoLoginAuthKey;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginName=" + loginName + ", nickName="
				+ nickName + ", password=" + password + ", email=" + email
				+ "]";
	}
	
}
