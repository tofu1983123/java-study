package cn.wyzc.bbs.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String description;
	private boolean defaultForNewUser;
	//�ý�ɫ����Щ�û���ӵ��
	private Set<User> users = new HashSet<User>();
	//�ý�ɫ����ЩȨ��
	private Set<Systemprivilege> systemprivileges = new HashSet<Systemprivilege>();
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDefaultForNewUser() {
		return defaultForNewUser;
	}
	public void setDefaultForNewUser(boolean defaultForNewUser) {
		this.defaultForNewUser = defaultForNewUser;
	}
	public Set<Systemprivilege> getSystemprivileges() {
		return systemprivileges;
	}
	public void setSystemprivileges(Set<Systemprivilege> systemprivileges) {
		this.systemprivileges = systemprivileges;
	}
	
}
