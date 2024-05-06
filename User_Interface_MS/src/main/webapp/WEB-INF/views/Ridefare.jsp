<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update ride details</title>
</head>
<body>

       <br>
       <br>
          <h2>Ride Details</h2>
      
      <form action="${r.getBookingId()}" method="post" modelAttribute="ride">
                                  <label>Customer ID</label>
                                  <input type="number" class="form-control" name="bookingId" value="${r.getBookingId()}">
                                  <label for="exampleInputCustomerName" class="form-label">Customer Name</label>
                                  <input type="text" class="form-control" name="customer_name" value="${r.getCustomer_name()}"  style="width:300px"><br><br>
                                 <label for="exampleInputContactNumber" class="form-label">Phone Number</label>
                                 <input type="text" class="form-control" name="customerPhNo" value="${r.getCustomerPhNo()}" style="width:300px"><br><br>
                                 <label class="form-label" for="exampleInputPickUpLocation">Pick up Location</label>
                                 <input type="text" class="form-control" name="source" value="${r.getSource()}" style="width:300px"><br><br>
                                   <label class="form-label" for="exampleInputDropLocation">Drop Location</label>
                                   <input type="text" class="form-control" name="destination" value="${r.getDestination()}" style="width:300px"><br><br>
                                   <label class="form-label" for="exampleInputPickUpTime">Pick up time</label>                                
                                   <input type="datetime" class="form-control" name="pickUpTime" value="${r.getPickUpTime()}" style="width:300px"><br><br>
                                   <label class="form-label" for="exampleInputDropTime">Dropping Time</label>
                                   <input type="datetime" class="form-control" name="dropTime" style="width:300px"><br><br>
                                   <label class="form-label" for="exampleInputDropTime">Distance</label>
                                   <input type="number" class="form-control" name="distance" style="width:300px"><br><br>
                                   <label class="form-label" for="exampleInputCabType">Cab Details</label>
                                   <select name="cabId" style="width:300px">
                                        <option value="${r.getCabId()}">${c.getDriverName()}</option>
                                            
                                   </select><br><br>
                                   <input type="submit" value="submit">
     </form> 
       
       
</body>
</html>