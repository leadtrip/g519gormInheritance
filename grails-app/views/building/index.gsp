<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
    <table class="table table-bordered">
        <tr>
            <th>Address</th>
            <th>Class</th>
        </tr>
        <g:each in="${buildings}" var="building">
            <tr>
                <td>${building.address}</td>
                <td>${building.class}</td>
            </tr>
        </g:each>
    </table>
</body>
</html>