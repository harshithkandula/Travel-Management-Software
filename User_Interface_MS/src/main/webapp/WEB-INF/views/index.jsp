<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>George Travels: Home</title>
</head>
<body>

      
      <div class="photo">
           <img src="E:\SpringBoot_Course_Project\photos\cab1.jpg" alt="cab">
       </div>
       <div class="photo">
           <img src="E:\SpringBoot_Course_Project\photos\cab2.jpg" alt="cab">
       </div>
       <div class="photo">
           <img src="E:\SpringBoot_Course_Project\photos\cab3.jpg" alt="cab">
       </div>
       
       <script>
           
       let slideIndex = 0;
       showSlides();

       function showSlides(){
           let i;
           let photos = document.getElementsByClassName("photo");
           for (i = 0; i < photos.length; i++) {
               photos[i].style.display = "none";
               
           }
           slideIndex++;
           if(slideIndex > photos.length){
               slideIndex = 1;
           }
           photos[slideIndex - 1].style.display = "block";
           setTimeout(showSlides, 2000);

       }
       </script>
     
     
</body>
</html>