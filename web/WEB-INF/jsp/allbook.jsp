<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 12345
  Date: 2020/5/29
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询全部书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表--------显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 colum">
                <a href="${pageContext.request.contextPath}/book/allbook" class="btn btn-primary">返回主页</a>
                <a href="${pageContext.request.contextPath}/book/toaddbook" class="btn btn-primary">新增书籍</a>
            </div>
           <div class="col-md-4 colum"></div>
            <div class="col-md-4 colum">
                <form action="${pageContext.request.contextPath}/book/querybook" method="post" style="float: right">
                    <input type="text" name="queryBookName" placeholder="请输入要查询的书籍名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>
</div>
<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍描述</th>
                <th>更新操作</th>
                <th>删除操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${list}">
                <tr>
                <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>

                    <td>
                        <a href="${pageContext.request.contextPath}/book/toupdatebook?id=${book.bookID}">修改</a>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/book/detebook?id=${book.bookID}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            <span style="color: red;font-weight: bold">${error}</span>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
