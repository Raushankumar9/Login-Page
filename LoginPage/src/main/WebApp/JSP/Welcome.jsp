<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome, <span th:text="${name}">User</span>!</h2>
    <p>You have successfully logged in.</p>
</body>
</html>
