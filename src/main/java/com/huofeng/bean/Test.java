package com.huofeng.bean;

public class Test {
	private  int id;
	private  String uname;
	private String dateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Test{" +
				"id=" + id +
				", uname='" + uname + '\'' +
				", dateTime='" + dateTime + '\'' +
				'}';
	}
}
