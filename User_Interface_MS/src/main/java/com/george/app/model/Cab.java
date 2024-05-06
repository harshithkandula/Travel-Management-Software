package com.george.app.model;

public class Cab {

private int cabId;
	
	
	private String driverName;
	
	
	private String rtNumber;
	
	private String vehicleType;
	
	private String phoneNumber;
	
	
	private String serviceLocation;
	
	
	
	

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
				+ vehicleType + ", phoneNumber=" + phoneNumber + ", serviceLocation=" + serviceLocation
				+ ", bookingStatus=" + bookingStatus + "]";
	}


	
	
	
}
