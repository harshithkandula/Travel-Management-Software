package com.george.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.george.app.model.Cab;
import com.george.app.model.Ride;

@RestController
@RequestMapping("/generate-receipt")
public class FcController {

	
	@Autowired
	CabRepo cabRepo;
	
	@Autowired
	RideRepo rideRepo;
	
	
	@GetMapping("/ride-data/{id}")
	public Ride getRideDetails(Model model, @PathVariable int id) {
		
		Optional<Ride> ridedet = rideRepo.findById(id);
		Ride r = new Ride();
		
		if(ridedet.isPresent()) {
			r = ridedet.get();
			model.addAttribute("r", r);
		}
		
		return r;
	}
	
	@PostMapping("/update-ride-info")
	public Ride rideCompletion(Model model, @RequestBody Ride ride) {
		
		
		ride.setFare(ride.getDistance()*15);
		ride = rideRepo.save(ride);
		return ride;
	}
	
	@PostMapping("/status-unbooked")
	public Cab updateCabBookingStatus(@RequestBody Cab cab) {
		
		cab.setBookingStatus("Not Booked");
		cab=cabRepo.save(cab);
		
		return cab;
	}
	
}
