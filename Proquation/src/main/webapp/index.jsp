<!-- Author name: Swarnalatha Sreenigarajan
Co-author name: Raghavan Sreenivasa -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link rel="stylesheet" type="text/css"
	href="/Proquation/css/homepage.css"/>
	<link rel="stylesheet" type="text/css"
	href="/Proquation/css/studentViewPractice.css"/>
</head>
<body>
	<div class="header">
        <img src="/Proquation/images/logo.jpg" alt="logo" class = "logo" />
        <h1>Proquation</h1>
    </div>
	<div class="homepage-container">
		<section class="student-section">
			<h1>Student</h1>
			<a href="studentLogin.jsp">
				<img src="/Proquation/images/student-icon.png" alt="student"/>
			</a>
		</section>
		<section class="teacher-section">
			<h1>Teacher</h1>
			<a href="teacherLogin.jsp">
				<img src="/Proquation/images/teacher-icon.png" alt="teacher"/>
			</a>
		</section>
		<section class="admin-section">
			<h1>Admin</h1>
			<a href="adminLogin.jsp">
				<img src="/Proquation/images/admin-icon.png" alt="admin"/>
			</a>
		</section>
	</div>
</body>
</html>