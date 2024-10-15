<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
    <style>
        body { background-color: skyblue; color: white; }
        input { margin: 5px; }
    </style>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="CalculatorServlet" method="post">
    <input type="number" name="num1" required placeholder="Number 1"/>
    <input type="number" name="num2" required placeholder="Number 2"/>
    <input type="number" name="num3" required placeholder="Number 3"/>

    <select name="operation">
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
    </select>

    <input type="submit" value="Calculate"/>
</form>

<%
    if (request.getAttribute("result") != null) {
%>
<div>Result: <%= request.getAttribute("result") %></div>
<%
    }
%>

</body>
</html>