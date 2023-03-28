package com.rushikeshit.request;

public class Passenger {

	private String fname;
	private String lname;
	private String from;
	private String to;
	private String doj;
	private String tainNum;
	
	public Passenger(){
	
	
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getTainNum() {
		return tainNum;
	}

	public void setTainNum(String tainNum) {
		this.tainNum = tainNum;
	}

	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", doj=" + doj
				+ ", tainNum=" + tainNum + "]";
	}

}
