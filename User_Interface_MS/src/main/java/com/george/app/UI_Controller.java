package com.george.app;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.george.app.model.Cab;
import com.george.app.model.Ride;

@Controller
public class UI_Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/calculate-fare")
	public String calculateFare(Model model) {
		Cab[] cab = restTemplate.getForObject("http://booking-microservices/book-cab/cabs", Cab[].class);
		Ride[] ride = restTemplate.getForObject("http://booking-microservices/book-cab/rides", Ride[].class);
		
		Cab cd = null;
		ArrayList<Cab> cdet = new ArrayList<Cab>();
		String cdn = null;
		for(Ride r: ride) {
			cd = restTemplate.getForObject("http://booking-microservices/book-cab/cab-details/"+r.getCabId()+"", Cab.class);
			   //cdn = cd.getDriverName();
			   cdet.add(cd);
			   
		}
		
		
		model.addAttribute("cabDet", cdet);
		model.addAttribute("c", cab);
		model.addAttribute("r", ride);
		return "calculateFare";
	}
	
	@GetMapping("/listRides")
	public String listOfRides(Model model) {
		Ride[] ride = restTemplate.getForObject("http://booking-microservices/book-cab/rides", Ride[].class);
		model.addAttribute("r", ride);
		return "list-of-rides";
	}
	
	@GetMapping("/cab-info/{id}")
	public String cabDetailPage(Model model, @PathVariable int id) {
		Cab cab = restTemplate.getForObject("http://booking-microservices/book-cab/cab-details/"+id+"", Cab.class);
		model.addAttribute("c", cab);
		
		return "Cabdetails";
	}
	
	@GetMapping("/give-ride-info")
	public String bookARideForm() {
		
		System.out.println("UI to book cab is ready");
		/*Cab[] cabs = restTemplate.getForObject("http://localhost:8080/book-cab/available-cabs", Cab[].class);
		
		//String bookRideForm = restTemplate.getForObject("http://localhost:8080/book-cab/book-ride", String.class);
		model.addAttribute("cabs", cabs);
		for(Cab c: cabs) {
			System.out.printf("cabId: %s DriverName: %s \n",c.getCabId(),c.getDriverName());
			
		}*/
		
		return "Bookcab";
	
	}
	
	@PostMapping("/give-ride-info")
	public String bookCab(Model model, @ModelAttribute("ride") Ride ride) {
		
		//int cabName = Integer.parseInt(cabname);
		//Ride ride = new Ride(cabName, name, phno, pick_up, drop, pick_time);
		//Ride[] rides = restTemplate.exchange("http://localhost:8080/book-cab/book-ride", Ride[].class, , null)
		System.out.printf("Booking ID: %s, Cab Id: %s \n", ride.getBookingId(), ride.getCabId());
		//int cid = ride.getCabId();
		
		//String rides = restTemplate.postForObject("http://localhost:8080/book-cab/fill-ride-info", ride, String.class);
		
		model.addAttribute("r", ride);
		Cab[] cabs = restTemplate.postForObject("http://booking-microservices/book-cab/choose-cab", ride,Cab[].class);
		//Cab cab = restTemplate.getForObject("http://localhost:8080/book-cab/cab-details/"+ride.getCabId()+"", Cab.class);
		//Cab c = restTemplate.postForObject("http://localhost:8080/book-cab/status-booked", cab, Cab.class);
		
		//model.addAttribute("cabdetails", c.toString());
		
		for(Cab c: cabs) {
			System.out.println(c.toString());
		}
		model.addAttribute("cabs", cabs);
		
		return "select-cab";
	}
	
	@PostMapping("/schedule-ride")
	public String scheduleRide(Model model, @ModelAttribute("ride") Ride ride) {
		
		String rides = restTemplate.postForObject("http://booking-microservices/book-cab/fill-ride-info", ride, String.class);
		model.addAttribute("r", ride);
		
		Cab cab = restTemplate.getForObject("http://booking-microservices/book-cab/cab-details/"+ride.getCabId()+"", Cab.class);
		Cab c = restTemplate.postForObject("http://booking-microservices/book-cab/status-booked", cab, Cab.class);
		
		model.addAttribute("cabdetails", c.toString());
		
		return "ride-booking-success";
	}
	
	@GetMapping("/fare-details/{id}")
    public String calculateRideFare(Model model,@PathVariable int id) {
		
		Ride ride = restTemplate.getForObject("http://farecalculation-microservices/generate-receipt/ride-data/"+id+"", Ride.class);
		Cab cab = restTemplate.getForObject("http://booking-microservices/book-cab/cab-details/"+ride.getCabId()+"", Cab.class);
		model.addAttribute("r", ride);
		model.addAttribute("c",cab);
		//String farePage = restTemplate.getForObject("http://localhost:8081/ride-info/calculateFare", String.class);
		
		return "Ridefare";
	}
	
	@PostMapping("/fare-details/{id}")
	public String endRide(Model model, @ModelAttribute("ride") Ride ride) {
    	Ride r = restTemplate.postForObject("http://farecalculation-microservices/generate-receipt/update-ride-info", ride, Ride.class);
    	//Cab c = restTemplate.postForEntity("http://localhost:8081/ride-info/update-cab-info/", r, Cab.class);
    	Cab c = restTemplate.getForObject("http://booking-microservices/book-cab/cab-details/"+r.getCabId()+"", Cab.class);
    	
    	Cab cab = restTemplate.postForObject("http://farecalculation-microservices/generate-receipt/status-unbooked", c, Cab.class);
    	
    	model.addAttribute("ride", r);
    	model.addAttribute("cab", cab);
    	
    	
    	return "ridereceipt";
    }
	
	@GetMapping("/join-travels")
	public String registerTravelsForm() {
		return "Addcab";
	}
	
	@PostMapping("/join-travels")
    public String joinerRegistration(Model model, @ModelAttribute("cab") Cab cab) {
		
		Cab c = restTemplate.postForObject("http://booking-microservices/book-cab/add-cab", cab, Cab.class);
		Cab cd = restTemplate.getForObject("http://booking-microservices/book-cab/cab-details/"+c.getCabId()+"", Cab.class);
		
		model.addAttribute("cab", cd);
		return "add-cab-success";
	}
	
	@GetMapping("/listCabs")
	public String openLoC(Model model) {
		
		Cab[] cab = restTemplate.getForObject("http://booking-microservices/book-cab/cabs", Cab[].class);
		model.addAttribute("c", cab);
		
		return "list-of-cabs";
	}
	
}
