<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Add Student</title>

    <style>
        body {
            font-family: Arial;
            background: #f4f6f8;
            padding: 20px;
        }

        h2 {
            color: #333;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            background: white;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
        }

        th {
            background: #007bff;
            color: white;
        }

        a, button {
            background: #007bff;
            color: white;
            padding: 6px 10px;
            text-decoration: none;
            border: none;
            border-radius: 4px;
        }

        input, select {
            padding: 8px;
            margin: 5px 0;
        }
    </style>

</head>
<body>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>

<h2>Add Student</h2>

<form action="save" method="post">
    Name: <input type="text" name="name"/><br/>
    Email: <input type="text" name="email"/><br/>

    Course:
    <select name="course.id">
        <c:forEach var="c" items="${courses}">
            <option value="${c.id}">${c.courseName}</option>
        </c:forEach>
    </select>

    <button type="submit">Save</button>
</form>
</body>
</html>