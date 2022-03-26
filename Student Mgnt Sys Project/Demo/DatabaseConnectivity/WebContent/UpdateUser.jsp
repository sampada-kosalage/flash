<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="container mtb">
<div class="row">
<div class="col-lg-6">
<form action ="${pageContext.request.contextPath}/operation" method="post">
Username:<input type="text" name="username" value="${param.username}" required="required"/>
<input type="hidden" name="userId" values="${param email}" required="required"/><br/>
<input type="hidden" name="form" value="updateUserOperation"/>
<input type="submit" values="Update User"/>
</form>
</div>
</div>
<%@include files="include/footer.jsp" %>