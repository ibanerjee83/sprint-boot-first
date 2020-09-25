<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>	
	<spring:url value="/resources/css/landingpage.css" var="mainCss" />
    <link href="${mainCss}" rel="stylesheet" />
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   </head>

<body>
<form action="authmem" method="post">

<div class="page">

 <label class="field a-field a-field_a3">
    <input type="text" name="name" class="field__input a-field__input" placeholder="e.g. Indranil" required value="${name}"/>
    <span class="a-field__label-wrap">
      <span class="a-field__label">Welcome ${name}</span>
    </span>
  </label>
 <br>
  <label class="field a-field a-field_a1">
    <input type="text" name="age" class="field__input a-field__input" placeholder="e.g.30" required>
    <span class="a-field__label-wrap">
      <span class="a-field__label">Enter Age:-</span>
    </span>
  </label>
  
  <label class="field a-field a-field_a2">
    <input type="text" name="address" class="field__input a-field__input" placeholder="e.g. calcutta" required>
    <span class="a-field__label-wrap">
      <span class="a-field__label">City</span>
    </span>
  </label>    
   <label class="field a-field a-field_a4">
     <center><input type="submit" name="submem"></center>
  </label>  
  </div>
</form>
</body>
</html>