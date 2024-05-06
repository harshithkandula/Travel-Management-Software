<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Cab</title>
</head>
<body>
      <br>
      <br>
      <div style="margin-top:30px">
      
                      <form action="give-ride-info" method="post" modelAttribute="ride">
                                  <label for="exampleInputCustomerName" class="form-label">Customer Name</label>
                                  <input type="text" class="form-control" name="customer_name"   style="width:300px"><br><br>
                                  <label for="exampleInputContactNumber" class="form-label">Phone Number</label>
                                  <input type="text" class="form-control" name="customerPhNo" style="width:300px"><br><br>
                                  <label class="form-label" for="exampleInputPickUpLocation">Pick up Location</label>
                                  <input type="text" class="form-control" name="source" style="width:300px"><br><br>
                                  <label class="form-label" for="exampleInputDropLocation">Drop Location</label>
                                  <input type="text" class="form-control" name="destination" style="width:300px"><br><br>
                                  <label class="form-label" for="exampleInputPickUpTime">Pick up time</label>
                                  <input type="datetime" class="form-control" name="pickUpTime" style="width:300px"><br><br>
                                  
                                   
                                   <input type="submit" value="proceed">
                      </form>   
                      
        </div>
        
</body>
</html>