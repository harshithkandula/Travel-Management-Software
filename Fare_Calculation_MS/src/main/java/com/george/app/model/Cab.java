package com.george.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cab")
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cab_id")
	private int cabId;
	
	@Column(name="driver_name")
	private String driverName;
	
	@Column(name="rt_number")
	private String rtNumber;
	@Column(name="vehicle_type")
	private String vehicleType;
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="service_location")
	private String serviceLocation;
	
	
	@Column(name="booking_status")
	private String bookingStatus;


	public int getCabId() {
		return cabId;
	}


	public void setCabId(int cabId) {
		this.cabId = cabId;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public String getRtNumber() {
		return rtNumber;
	}


	public void setRtNumber(String rtNumber) {
		this.rtNumber = rtNumber;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    
	
	
	public String getServiceLocation() {
		return serviceLocation;
	}


	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}


	


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", driverName=" + driverName + ", rtNumber=" + rtNumber + ", vehicleType="
				+ vehicleType + ", phoneNumber=" + phoneNumber + ", serviceLocation=" + serviceLocation + ", bookingStatus=" + bookingStatus + "]";
	}
	
	
}
