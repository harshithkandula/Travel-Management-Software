<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ride Receipt</title>
</head>
<body>
       
       
     <br>
     <br>
       
     <h2>Thank you</h2>
     
     <h3>Ride Details</h3>
     <p>Customer Name: ${ride.getCustomer_name()}</p>
     <p>Booking ID: ${ride.getBookingId()}</p>
     <p>Pickup Location: ${ride.getSource()}</p>
     <p>Drop Location: ${ride.getDestination()}</p>
     <p>Distance: ${ride.getDistance()}</p>
     <p>Pick Up Time: ${ride.getPickUpTime()}</p>
     <p>Drop Time: ${ride.getDropTime()}</p>
     <p>Fare: ${ride.getFare()}</p>
     <p> Cab Details: ${cab.toString()}</p>
       
       
</body>
</html>