<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Cabs</title>
</head>
<body>
  
    
    <br><h4>List Of Cabs</h4>
     <table border=1>
            <tr>
               <th>Cab ID</th>
               <th>Driver Name</th>
               <th>Registration Number</th>
               <th>Vehicle Type</th>
               <th>Phone Number</th>
               <th>Service Location</th>
               <th>Booking Status</th>
            </tr>
            <c:forEach var="y" items="${c}">
                   <tr>
                      <td>${y.getCabId()}</td>
                      <td>${y.getDriverName()}</td>
                      <td>${y.getRtNumber()}</td>
                      <td>${y.getVehicleType()}</td>
                      <td>${y.getPhoneNumber()}</td>
                      <td>${y.getServiceLocation()}</td>
                      <td>${y.getBookingStatus()}</td>
                   </tr>
            </c:forEach>
     </table>
</body>
</html>