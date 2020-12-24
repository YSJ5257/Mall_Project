<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
    <link rel="stylesheet" type="text/css" href="css/login_change.css"/>
</head>
<body><!-------------------login-------------------------->
<div class="login" id="app">
    <form action="userServlet" id="fo" method="post"><h1><a href="login.jsp"><img src="img/temp/logo.png"></a></h1>
        <p></p>
        <div class="msg-warn hide"><b></b>公共场所不建议自动登录，以防账号丢失</div>
        <p><input type="text" name="uname" value="" placeholder="昵称/邮箱/手机号"></p>
        <p><input type="password" name="pwd" value="" placeholder="密码"></p>
        <p><input type="submit" name="" value="登  录"></p>
        <p class="txt"><a class="" href="reg">免费注册</a><a href="forget">忘记密码？</a></p></form>
</div> 
 <script src="./js/jquery-1.8.2.min.js" type="text/javascript"></script>
<script src="./js/vue.min.js" type="text/javascript"></script>
<script>
Vue.config.devtools = true;
  const app = new Vue({
    el: "#app",
    data: {
    	 loginType: 'uname'
    },
    methods: {
      btnClick :function(){
      
          $.ajax({
				url:"userServlet",
				type:"post",
				data:{
					uname:"",
					email:"",
					phone:"",
					pwd:""
				},
				dataType:"text",
				success:function(message){
					alert(message+"");
				},error : function(message){
					alert("ajax---error");
				}
          });
          }
    }
    });
  </script>
</body>
</html>