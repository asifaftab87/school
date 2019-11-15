<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
	<head>
		
	    <title>Registration Form</title>
	    <link rel="stylesheet" type="text/css" href="/css/registration.css"/>
	    <link rel="stylesheet" type="text/css" href="/css/login.css"/>
	    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
	    <script src="webjars/jquery/3.4.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	</head>
	<body>
	
		<form action="/" method="get">
		    <button class="btn btn-md btn-warning btn-block" type="Submit">Go To Login Page</button>
		</form>
	
		<div class="container">
		    <div class="row">
		        <div class="col-md-6 col-md-offset-3">
		            <form autocomplete="off" action="#" action="/registration" modelAttribute="user" method="post" class="form-horizontal" role="form">
		                <h2>Registration Form</h2>
		                <div class="form-group">
		                    <div class="col-sm-9">
		                        <label th:if="${#fields.hasErrors('name')}" th:errors="*{name}"
		                               class="validation-message"></label>
		                        <input type="text" th:field="*{name}" placeholder="Name"
		                               class="form-control"/>
		                    </div>
		                </div>
		
		                <div class="form-group">
		                    <div class="col-sm-9">
		                        <label th:if="${#fields.hasErrors('lastName')}" th:errors="*{lastName}"
		                               class="validation-message"></label>
		                        <input type="text" th:field="*{lastName}"
		                               placeholder="Last Name" class="form-control"/>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <div class="col-sm-9">
		                        <input type="text" th:field="*{email}" placeholder="Email"
		                               class="form-control"/> <label
		                            th:if="${#fields.hasErrors('email')}" th:errors="*{email}"
		                            class="validation-message"></label>
		                    </div>
		                </div>
		                <div class="form-group">
		                    <div class="col-sm-9">
		                        <input type="password" th:field="*{password}"
		                               placeholder="Password" class="form-control"/> <label
		                            th:if="${#fields.hasErrors('password')}" th:errors="*{password}"
		                            class="validation-message"></label>
		                    </div>
		                </div>
		
		                <div class="form-group">
		                    <div class="col-sm-9">
		                        <button type="submit" class="btn btn-primary btn-block">Register User</button>
		                    </div>
		                </div>
		
		                <h2><span class="text-success" th:utext="${successMessage}"></span></h2>
		
		            </form>
		        </div>
		    </div>
		</div>
	
	</body>
</html>