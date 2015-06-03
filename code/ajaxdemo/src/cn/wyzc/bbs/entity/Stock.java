package cn.wyzc.bbs.entity;
//模拟股票
public class Stock {
	private String id;
	private String name;
	private double yestoday;
	private double today;
	private double now;
	public Stock(){
		
	}
	
	public Stock(String id, String name, double yestoday, double today) {
		super();
		this.id = id;
		this.name = name;
		this.yestoday = yestoday;
		this.today = today;
		this.now = today;
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
	public double getYestoday() {
		return yestoday;
	}
	public void setYestoday(double yestoday) {
		this.yestoday = yestoday;
	}
	public double getToday() {
		return today;
	}
	public void setToday(double today) {
		this.today = today;
	}
	public double getNow() {
		return now;
	}
	public void setNow(double now) {
		this.now = now;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", yestoday=" + yestoday
				+ ", today=" + today + ", now=" + now + "]";
	}
	
}
