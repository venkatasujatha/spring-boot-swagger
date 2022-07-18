package com.example.demo.Request;

public class PassengerInfo {
	
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightid;
	private String journeydate;
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
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getJourneydate() {
		return journeydate;
	}
	public void setJourneydate(String journeydate) {
		this.journeydate = journeydate;
	}
	public PassengerInfo(String fname, String lname, String from, String to, String flightid, String journeydate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.from = from;
		this.to = to;
		this.flightid = flightid;
		this.journeydate = journeydate;
	}
	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PassengerInfo [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", flightid="
				+ flightid + ", journeydate=" + journeydate + "]";
	}
	
	

}
