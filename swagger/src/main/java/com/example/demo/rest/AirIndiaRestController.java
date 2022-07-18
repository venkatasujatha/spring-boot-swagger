package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Request.PassengerInfo;
import com.example.demo.Response.TicketInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("This is Air India distributed application")
public class AirIndiaRestController {
	
	@PostMapping("/bookFlightTicket")
	@ApiOperation("This is used to book the flight ticket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo info)
	{
		//login to book ticket
		
		//send ticket info
		TicketInfo ticketInfo=new TicketInfo();
		ticketInfo.setName(info.getFname()+""+info.getLname());
		ticketInfo.setFrom(info.getFrom());
		ticketInfo.setTo(info.getTo());
		ticketInfo.setJourneydate(info.getJourneydate());
		ticketInfo.setTicketstatus("Confirmed");
		ticketInfo.setTicketprice("4500.00 INR");
		return new ResponseEntity(ticketInfo,HttpStatus.CREATED);
	}
	
	

}
