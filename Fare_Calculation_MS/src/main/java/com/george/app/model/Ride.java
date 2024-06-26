package com.george.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ride")
public class Ride {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rid")
	private int bookingId;
	
	@Column(name="cab_id")
	private int cabId;
	
	@Column(name="customer_name")
	private String customer_name;
	
	@Column(name="customer_phone_number")
	private String customerPhNo;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="pickup_time")
	private String pickUpTime;
	
	@Column(name="drop_time")
	private String dropTime;
	
	@Column(name="distance")
	private int distance;
	
	@Column(name="fare")
	private int fare;

	

	
	
	public Ride() {
		
	}

	public Ride(int bookingId, int cabId, String customer_name, String customerPhNo, String source, String destination,
			String pickUpTime, String dropTime, int distance, int fare) {
		
		this.bookingId = bookingId;
		this.cabId = cabId;
		this.customer_name = customer_name;
		this.customerPhNo = customerPhNo;
		this.source = source;
		this.destination = destination;
		this.pickUpTime = pickUpTime;
		this.dropTime = dropTime;
		this.distance = distance;
		this.fare = fare;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	

	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomerPhNo() {
		return customerPhNo;
	}

	public void setCustomerPhNo(String customerPhNo) {
		this.customerPhNo = customerPhNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getDropTime() {
		return dropTime;
	}

	public void setDropTime(String dropTime) {
		this.dropTime = dropTime;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	
}
