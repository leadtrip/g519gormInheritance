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
        <th>Number of gears</th>
    </tr>
    <g:each in="${bicycles}" var="bicycle">
        <tr>
            <td>${bicycle.id}</td>
            <td>${bicycle.primaryPowerSource}</td>
            <td>${bicycle.numberOfGears}</td>
        </tr>
    </g:each>
</table>
</body>
</html>