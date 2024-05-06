<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>George Travels: Cab Details</title>
</head>
<body>

    
     <br>
     <h2>Cab ${c.getCabId()} Details</h2>
     <p>Cab Id: ${c.getCabId()}</p>
     <p>Driver Name: ${c.getDriverName()}</p>
     <p>Registration Number: ${c.getRtNumber()}</p>
     <p>Vehicle Type: ${c.getVehicleType()}</p>
     <p>Phone Number: ${c.getPhoneNumber()}</p>
     <p>Service Area: ${c.getServiceLocation()}</p>
     
</body>
</html>