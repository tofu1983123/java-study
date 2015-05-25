package lesson2.orm;
/*
 * create table bbs_Forum(
   id number primary key,
   forum_name varchar2(10)
   );
 * */
@Entity("bbs_Forum")
public class Forum {
	private int id;
	@Column("forum_name")
	private String name;
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
	
}
