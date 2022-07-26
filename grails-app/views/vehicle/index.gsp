<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<table class="table table-bordered">
    <tr>
        <th>ID</th>
        <th>Primary power source</th>
    </tr>
    <g:each in="${vehicles}" var="vehicle">
        <tr>
            <td>${vehicle.id}</td>
            <td>${vehicle.primaryPowerSource}</td>
        </tr>
    </g:each>
</table>
</body>
</html>