<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
    <tiles:insertAttribute name="content"></tiles:insertAttribute>
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>

</body>
</html>