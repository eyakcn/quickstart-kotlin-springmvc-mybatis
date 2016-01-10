#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ include file="taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Welcome</title>
  <link type="text/css" href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet"/>
  <link type="text/css" href='<spring:url value="/resources/jquery/css/redmond/jquery-ui-1.8.21.custom.css"/>' rel="stylesheet"/>
  <script type="text/javascript" src='<spring:url value="/resources/jquery/js/jquery-1.7.2.min.js"/>'></script>
  <script type="text/javascript" src='<spring:url value="/resources/jquery/js/jquery-ui-1.8.21.custom.min.js"/>'></script>
  <script>
    ${symbol_dollar}(function() {
      alert('jQuery Initialized successfully');
    });
  </script>
</head>

<body>
Welcome!!
<h2>List of Users:</h2>
<div>
  <c:if test="${symbol_dollar}{USERS != null }">
    <c:forEach items="${symbol_dollar}{USERS}" var="user">
      <p>${symbol_dollar}{user.userId} - ${symbol_dollar}{user.userName}</p>
    </c:forEach>
  </c:if>
</div>
</body>

</html>