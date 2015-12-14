<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Album</title>
        <link rel="stylesheet" type="text/css" href="style.css"
    </head>
    <body>
        <%@ include file="header.jsp" %>

        <%@ include file="menu.jsp" %>

        <div class="main">
            <h1>Add A New Album</h1>

            <form name="addForm" action="addAlbum" method="get">
                <table class="add">
                    <tbody>
                        <tr>
                            <td>Album Name:</td>
                            <td><input type="text" name="album" value="" size="50"</td>
                        </tr>
                        <tr>
                            <td>Artist Name:</td>
                            <td><input type="text" name="artist" value="" size="50"</td>
                        </tr>
                        <tr>
                            <td>Year of Release:</td>
                            <td><input type="text" name="year" value="" size="50"</td>
                        </tr>
                        <tr>
                            <td>Genre:</td>
                            <td><input type="text" name="genre" value="" size="50"</td>
                        </tr>
                    </tbody>
                </table>
                <div>
                    <input type="reset" value="Clear"  id="clear">
                    <input type="submit" value="Add"  id="add">
                </div>
            </form>
        </div> <!--main-->
        <%@ include file="footer.jsp" %>

    </div>
</div> <!-- wrap -->
</body>
</html>
