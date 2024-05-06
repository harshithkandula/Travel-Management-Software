<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>George Travels: Calculate Fare</title>
</head>
<body>
     
     
     <br><h4>List Of Rides</h4>
     <table border=1>
           <tr>
              <th>Booking ID</th>
              <th>Customer Name</th>
              <th>Cab Details</th>
              <th>Update Ride Details</th>
              
           </tr>
           <c:forEach var="x" items="${r}">
           
                <tr>
                
                   <td>${x.getBookingId()}</td>
                   <td>${x.getCustomer_name()}</td>
                   <td><a href="http://localhost:9090/cab-info/${x.getCabId()}">${x.getCabId()}</a></td>
                   <td><a href="http://localhost:9090/fare-details/${x.getBookingId()}">Update</a></td>
                </tr>
           </c:forEach>
     </table>
     
     
     
</body>
</html>