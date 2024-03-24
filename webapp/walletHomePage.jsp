<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="walletHomePageStyles.css">
</head>
<body>

	<div class="container">

        <h1>Hello! <%= request.getAttribute("userName") %></h1>
        
        <div class="innerContainer">

            <div class="group">

                <form action="./WalletHomePageServlet" method="post">
                    <input type="hidden" name="userName" value="<%= request.getAttribute("userName") %>">
                    <input type="hidden" name="buttonValue" value="profileButton">
                    <button type="submit">Profile</button>
                </form>
                
            </div>
    
            <div class="group">
    
                <form action="./WalletHomePageServlet" method="post">
                	<input type="hidden" name="userName" value="<%= request.getAttribute("userName") %>">
                    <input type="hidden" name="buttonValue" value="recordsButton">
                    <button>Records</button>
                </form>
    
                <form action="./WalletHomePageServlet" method="post">
                    <input type="hidden" name="userName" value="<%= request.getAttribute("userName") %>">
                    <input type="hidden" name="buttonValue" value="newRecordButton">
                    <button>AddNewRecord</button>
                </form>
    
            </div>

        </div>

    </div>
    

</body>
</html>