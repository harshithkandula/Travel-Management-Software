package com.george.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.george.app.model.Db;
import com.george.app.model.Ride;

public class AppTest {

	Ride r = new Ride();
	Db d = new Db();
	
	@BeforeEach
	void setRideValues() {
		r.setCabId(9);
		r.setCustomer_name("Karan");
		r.setCustomerPhNo("8664910273");
		r.setSource("Tirupathi");
		r.setDestination("Karimnagar");
		r.setPickUpTime("24-04-2024 12:30");
		
		
	}
	
	@Test
	public void fareCalculationTest() {
		r.setDropTime("25-04-2024 1:30");
		r.setDistance(800);
		
		d.updateRideDetails(r);
		ArrayList<Ride> trd = d.fetchRideDetails(r.getBookingId());
		for(Ride t: trd) {
		   assertEquals(r.getBookingId(), t.getBookingId());
		   assertEquals(r.getDropTime(), t.getDropTime());
		   assertEquals(r.getDistance(), t.getDistance());
		   assertEquals(r.getFare(), t.getFare());
		}
	}

	
	/*@Test
	public void fareCalculationTest() {
		r.setDropTime("25-04-2024 10:00");
		r.setDistance(900);
		r.setFare(r.getDistance()*10);
		
		if(r!=null) {
		    rideRepo.save(r);
		}
		
		Optional<Ride> td = rideRepo.findById(r.getBookingId());
		Ride testData = td.get();
		assertEquals(r.getDropTime(), testData.getDropTime());
		assertEquals(r.getDistance(), testData.getDistance());
		assertEquals(r.getFare(), testData.getFare());
	}
	
	@AfterAll
	static void ridRideValues() {
		rideRepo.deleteById(r.getBookingId());
	}*/
}
