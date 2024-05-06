package com.george.app;

import com.george.app.Ride;
import com.george.app.Db;
import com.george.app.Cab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
   
	
	Ride r = new Ride();
	Db d = new Db();
	Cab c = new Cab();
	
	@BeforeEach
	public void settingUpData() {
		
		r.setCabId(4);
		r.setCustomer_name("Karan");
		r.setCustomerPhNo("8664910273");
		r.setSource("Tirupathi");
		r.setDestination("Karimnagar");
		r.setPickUpTime("24-04-2024 12:30");
		
		c.setDriverName("Bhadri J");
		c.setRtNumber("CG01 4371");
		c.setVehicleType("Mini Bus");
		c.setPhoneNumber("5173928846");
		c.setBookingStatus("Not Booked");
	}
	
	@Test
	public void bookingFunctionalityTest() {
	   d.addRide(r);
	   ArrayList<Ride> trd = d.fetchRideDetails(r.getBookingId());
	   for(Ride t: trd) {
		    assertEquals(r.getCabId(), t.getCabId());
			assertEquals(r.getCustomer_name(),t.getCustomer_name());
			assertEquals(r.getCustomerPhNo(), t.getCustomerPhNo());
			assertEquals(r.getSource(), t.getSource());
			assertEquals(r.getDestination(), t.getDestination());
			assertEquals(r.getPickUpTime(), t.getPickUpTime());
	   }
	}
	
	
	@Test
	public void cabRegistrationTest() {
	   d.addCab(c);
	   ArrayList<Cab> crd = d.fetchCabDetails(c.getCabId());
	   for(Cab x: crd) {
		   assertEquals(x.getCabId(), c.getCabId());
		   assertEquals(x.getDriverName(), c.getDriverName());
		   assertEquals(x.getRtNumber(), c.getRtNumber());
		   assertEquals(x.getPhoneNumber(), c.getPhoneNumber());
		   assertEquals(x.getVehicleType(), c.getVehicleType());
		   assertEquals(x.getBookingStatus(), c.getBookingStatus());
		   
	   }
	}
	


	
	
}
