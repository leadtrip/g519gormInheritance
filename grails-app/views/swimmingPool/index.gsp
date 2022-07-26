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
        <th>Address</th>
        <th>Number of lanes</th>
    </tr>
    <g:each in="${swimmingPools}" var="swimmingPool">
        <tr>
            <td>${swimmingPool.id}</td>
            <td>${swimmingPool.address}</td>
            <td>${swimmingPool.numberOfLanes}</td>
        </tr>
    </g:each>
</table>
</body>
</html>