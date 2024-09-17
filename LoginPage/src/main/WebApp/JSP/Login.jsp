<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
    <form th:action="@{/login}" method="post" th:object="${studentBean}">
        <label for="name">Name:</label>
        <input type="text" id="name" th:field="*{name}" required>
        <br>
        <label for="pass">Password:</label>
        <input type="password" id="pass" th:field="*{pass}" required>
        <br>
        <button type="submit">Login</button>
    </form>
    <div th:if="${error}">
        <p style="color: red;" th:text="${error}"></p>
    </div>
</body>
</html>
