package com.example.demo.Response;

public class TicketInfo {
	
	private String name;
	private String from;
	private String to;
	private String flightid;
	private String journeydate;
	private String ticketprice;
	private String ticketstatus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public TicketInfo(String name, String from, String to, String flightid, String journeydate, String ticketprice,
			String ticketstatus) {
		super();
		this.name = name;
		this.from = from;
		this.to = to;
		this.flightid = flightid;
		this.journeydate = journeydate;
		this.ticketprice = ticketprice;
		this.ticketstatus = ticketstatus;
	}
	public TicketInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TicketInfo [name=" + name + ", from=" + from + ", to=" + to + ", flightid=" + flightid
				+ ", journeydate=" + journeydate + ", ticketprice=" + ticketprice + ", ticketstatus=" + ticketstatus
				+ "]";
	}
	

}
