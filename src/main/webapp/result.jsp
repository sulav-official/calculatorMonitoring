<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculation Result</title>
    <style>
        body {
            background-color: skyblue;
            font-family: Arial, sans-serif;
        }
        .result {
            width: 300px;
            margin: 100px auto;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            text-align: center;
        }
        .error {
            color: red;
        }
        .back-button {
            margin-top: 20px;
        }
        .back-button a {
            text-decoration: none;
            color: white;
            background-color: #008CBA;
            padding: 10px 20px;
            border-radius: 5px;
        }
        .back-button a:hover {
            background-color: #007B9E;
        }
    </style>
</head>
<body>
<div class="result">
    <h2>Calculation Result</h2>
    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
    <p class="error"><%= error %></p>
    <%
    } else {
        Double result = (Double) request.getAttribute("result");
    %>
    <p><strong>Result:</strong> <%= result %></p>
    <%
        }
    %>
    <div class="back-button">
        <a href="index.jsp">Back to Calculator</a>
    </div>
</div>
</body>
</html>
