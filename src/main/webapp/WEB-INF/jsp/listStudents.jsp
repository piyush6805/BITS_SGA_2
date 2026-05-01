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
<h2>Student List</h2>

<div style="margin-bottom: 20px;">
    <a href="/add" style="display:inline-block;">Add Student</a>
</div>

<table border="1">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Course</th>
        <th>Action</th>
    </tr>

    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>${s.course.courseName}</td>
            <td><a href="/edit/${s.id}">Edit</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>