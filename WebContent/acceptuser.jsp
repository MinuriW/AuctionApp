<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
       <title>Accept User Page</title> 
    </head> 
    <body> 
        <h1>Verifying Details</h1> 
        
        <jsp:useBean id="login" class="login.ValidateUser"/> 
          
        <jsp:setProperty name="login" property="user"/> 
        <jsp:setProperty name="login" property="pass"/> 
          
        The Details Entered Are as Under<br/> 
        <p>Username : <jsp:getProperty name="login" property="user"/></p> 
        <p>Password : <jsp:getProperty name="login" property="pass"/></p> 
          
        <%if(login.validate("Minuri", "123")){%> 
            Welcome! You are a VALID USER<br/> 
        <%}else{%> 
            Error! You are an INVALID USER<br/> 
        <%}%>   
    </body> 
</html> 