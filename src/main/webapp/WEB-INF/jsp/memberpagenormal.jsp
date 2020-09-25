<html>
<title> Sprint Boot JSP Member Page</title>
<body> Welcome ${name} </body>
<form action="authmem" method="post">
<input type="hidden" name="name"  value="${name}"/>
Enter Age:- <input type="text" name="age"/>
Address : <input type="text" name="address"/>
<input type="submit" name="submem"/>
</form>
</body>
</html>