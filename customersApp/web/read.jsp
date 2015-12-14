<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Database of Our Customers</title>
        <link rel="stylesheet" type="text/css" href="css/style.css"
    </head>

    <% String table = (String) request.getAttribute("table"); %>

<body>

        <%@ include file="includes/header.jsp" %>
        <br>
        <div class="main">
            <br><br>
            <h1>Customer Database</h1>
                <div>
                    <br>
        <%= table %>
                    <br>

                </div> <!--main-->
        </div> <!--main-->
        <%@ include file="includes/footer.jsp" %>

    </div>
</div> <!-- wrap -->
</body>
</html>
