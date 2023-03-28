package com.rushikeshit.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rushikeshit.request.Passenger;
import com.rushikeshit.response.Ticket;

@RestController
public class TrainRestController {

	//Json Doc URL : http://localhost:8080/v2/api-docs
	//UI Doc URL : http://localhost:8080/swagger-ui.html#/
	private Map<Integer, Ticket> tickets = new HashMap<>();

	@PostMapping(value = "/ticket", consumes = { "application/xml", "application/json" }, produces = {
			"application/xml", "application/json" })
	public Ticket bookTicket(@RequestBody Passenger passenger) {

		Ticket t = new Ticket();
		Random r = new Random();
		Integer ticketId = r.nextInt();
		t.setTicketId(ticketId);
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTktCost("1500.0 INR");
		t.setTktStatus("Confirmed");
		t.setTrainNum(passenger.getTainNum());
		tickets.put(ticketId, t);
		return t;
	}
	@GetMapping(value = "/ticket/{ticketId}",
			produces = {"application/json" , "application/xml"}
	)
	public Ticket getTicket(@PathVariable Integer ticketId) {
		System.out.println(tickets);
		if(tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		return null;
		
	}
}
