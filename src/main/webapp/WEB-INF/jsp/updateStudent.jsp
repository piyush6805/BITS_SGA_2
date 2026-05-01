<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Update Student</title>

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
<h2>Update Student</h2>

<form action="/save" method="post">
    <input type="hidden" name="id" value="${student.id}"/>

    Name:
    <input type="text" name="name" value="${student.name}"/><br/>

    Email:
    <input type="text" name="email" value="${student.email}"/><br/>

    Course:
    <select name="course.id">
        <c:forEach var="c" items="${courses}">
            <option value="${c.id}"
                ${c.id == student.course.id ? 'selected' : ''}>
                    ${c.courseName}
            </option>
        </c:forEach>
    </select>

    <br/><br/>
    <button type="submit">Update</button>
</form>
</body>
</html>