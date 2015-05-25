package lesson1;

public class User {
	private int id;
	private String username;
	private String userpass;
	private String email;
	public User(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String username, String userpass, String email) {
		super();
		this.id = id;
		this.username = username;
		this.userpass = userpass;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", userpass="
				+ userpass + ", email=" + email + "]";
	}
}
