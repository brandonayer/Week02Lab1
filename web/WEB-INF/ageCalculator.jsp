<%-- 
    Document   : ageCalculator
    Created on : Sep 21, 2017, 1:46:29 PM
    Author     : 677571
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Next Birthday!</h1>
        <form action="agecalculator" method="post">
            Enter your current age
            <input type="number" name="currentAge">
            <input type="submit" value="Age Next Birthday">
        </form>
        ${returnMessage}
    </body>
</html>
