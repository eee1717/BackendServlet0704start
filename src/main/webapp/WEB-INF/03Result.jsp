<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<%
    String email = request.getParameter("email");
    String pwd = request.getParameter("pwd");
    String addr1 = request.getParameter("addr1");
    String addr2 = request.getParameter("addr2");

    PrintWriter pout = response.getWriter();
    out.println(email + "<br>");
    out.println(pwd + "<br>");
    out.println(addr1 + "<br>");
    out.println(addr2);
    
    
 
    
    
    
    
    
%>

</html>