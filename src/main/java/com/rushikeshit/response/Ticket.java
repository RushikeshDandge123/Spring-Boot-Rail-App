package com.rushikeshit.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {

	private Integer ticketId;
	private String from;
	private String to;
	private String trainNum;
	private String tktCost;
	private String tktStatus;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
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

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}

	public String getTktCost() {
		return tktCost;
	}

	public void setTktCost(String tktCost) {
		this.tktCost = tktCost;
	}

	public String getTktStatus() {
		return tktStatus;
	}

	public void setTktStatus(String tktStatus) {
		this.tktStatus = tktStatus;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", trainNum=" + trainNum
				+ ", tktCost=" + tktCost + ", tktStatus=" + tktStatus + "]";
	}

}
