<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <style>
         
         *{
            background-color: chocolate;
          }
         
         li{
           float:left;
         }
         
         li button a{
              text-decoration:none;
         }
         
         .ddn{
             position: relative;
             display: inline-block;
         }
         
         .ddn-ctn{
            display: none;
         }
         
         .ddn:hover .ddn-ctn{
            display: block;
         }
    </style>
</head>
<body>
       
       <h2>Welcome to George Travels</h2>
       <sub>We ride to your destination of success</sub>
       
       <div>
          <ul style="list-style-type: none">
             <li>
                <button>
                    <a href="http://localhost:9090/">Home</a>
                </button>
             </li>
             <li class="ddn">
                <button>
                     <a>Ride</a>
                </button>
                <div class="ddn-ctn">
                    <a href="http://localhost:9090/give-ride-info">Book  Ride</a>
                </div>
                <div class="ddn-ctn">
                    <a href="http://localhost:9090/listRides">List Of Rides</a>
                </div>
             </li>
             <li class="ddn">
                <button>
                      <a>Cab</a>
                </button>
                <div class="ddn-ctn">
                   <a href="http://localhost:9090/join-travels">Add Cab</a>
                </div>
                <div class="ddn-ctn">
                    <a href="http://localhost:9090/listCabs">List Of Cabs</a>
                </div>
             </li>
             
             <li style="margin-left:60%">
                  <button>
                        <a href="http://localhost:9090/give-ride-info">Book Ride</a>
                  </button>
             </li>
             <li>
                <button><a href="http://localhost:9090/calculate-fare">Calculate Fare</a></button>
             </li>
          </ul>
       </div>
       
</body>
</html>