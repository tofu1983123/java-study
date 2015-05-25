package lesson2.orm;
/*
 *create table tt(
  id number primary key,
  name varchar2(10),
  pass varchar2(20)
  );
 * */

public class TT {
	private int id;
	private String name;
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
