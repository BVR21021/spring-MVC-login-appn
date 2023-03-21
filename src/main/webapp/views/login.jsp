<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <h2>Login Form</h2>
    <form:form method="POST" modelAttribute="user" action="req1">
    User Name:<form:input path="name"/><p></p>
    Password:<form:input path="password"/><p></p>
    <input type="submit" value="Login">
    </form:form>