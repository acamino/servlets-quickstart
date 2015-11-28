<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlets Template | Books</title>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-7s5uDGW3AHqw6xtJmNNtr+OBRJUlgkNJEo78P4b0yRw= sha512-nNo+yCHEyn0smMxSswnf/OnX6/KwJuZTlNZBjauKhTK0c+zT+q5JOCx0UFhXQ6rJR9jg6Es8gPuD2uZcYDLqSw==" crossorigin="anonymous">
    <link href="css/site.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <nav class="navbar navbar-default navbar-static-top">
        <div class="container">
            <a class="navbar-brand" href="/">Servlet Template</a>
        </div>
    </nav>

    <div class="starter-template">
    <table class="table">
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>Year</th>
            </tr>
        </thead>
        <tbody>
        <core:forEach var="book" items="${books}">
            <tr>
                <td>
                    <a href="${book.url}" target="_blank">${book.title}</a>
                </td>
                <td>${book.author}</td>
                <td>${book.year}</td>
            <tr>
        </core:forEach>
        </tbody>
    </table>
    </div>

</div><!-- /.container -->
</body>
</html>