<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ride Booking: Success</title>
</head>
<body>
       
       
       <div>
                    <h4>Ride Details</h4>
                    <p>${r.getCabId()}</p>
                    <p>${r.getCustomer_name()}</p>
                    <p>${r.getCustomerPhNo()}</p>
                    <p>${r.getSource()}</p>
                    <p>${r.getDestination()}</p>
                    <p>${r.getPickUpTime()}</p>
                    <p>Cab Details: ${cabdetails}</p>
                    
        </div>
                
</body>
</html>