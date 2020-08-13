<%--
  Created by IntelliJ IDEA.
  User: 12345
  Date: 2020/5/29
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>

            </div>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/addbook" method="post">
    <div class="form-group">
        <label>书籍名称：</label>
        <input type="text" class="form-control" name="bookName" required>
    </div>
    <div class="form-group">
        <label>书籍数量：</label>
        <input type="text" class="form-control" name="bookCounts" required>
    </div>
    <div class="form-group">
        <label>书籍描述：</label>
        <input type="text" class="form-control" name="detail" required>
    </div>
    <div class="form-group">
        <input type="submit" class="form-control" value="添加">
    </div>
</form>
</body>
</html>
