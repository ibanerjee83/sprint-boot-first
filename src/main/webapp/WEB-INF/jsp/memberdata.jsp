<!DOCTYPE html>
<html>
<title> Sprint Boot JSP authorize Member Page</title>
<head>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #649BC0;
  color: white;
}

body{
	background:url(https://www.wallpapertip.com/wmimgs/47-479841_cloud-computing-wallpaper.jpg);
}

h1{
	color:white;
	text-align:center;
	margin-top:100px;
	text-shadow:4px 4px 4px black;
	font-size:50px;
}

</style>
</head>
<body>

<h1 id="welcome">
 Welcome ${name} Age:-${age} City:-${address} 
</h1>
<table id="customers">
  <tr>
    <th>Google Cloud</th>
    <th>Azure Cloud</th>
    <th> AWS </th>
  </tr>
  <tr>
    <td><a href="https://console.cloud.google.com"> Google Cloud console </a></td>
    <td><a href="https://portal.azure.com"> MS Azure Cloud console</a></td>
    <td><a href="https://aws.amazon.com/console/"> AWS Cloud console </a></td>
    </tr>
  </table>
<form action="login" method="post" name="login">
<input type="hidden" name="name"  value="${name}"/>
<input type="hidden" name="password">
<center><input type="submit" name="logout" value="logout"></center>

</body>
</html>