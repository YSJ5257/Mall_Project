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
        <p></p>
	    <span v-if="loginType === 'uname'">
		    <input type="text" name="uname" placeholder="请输入用户账号">
		</span>
		<span v-else-if="loginType==='email'">
		    <input type="text" name="email" required pattern="([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})" title="请输入正确的邮箱格式" 
		     placeholder="请输入邮箱地址">
		</span>
		<span v-else>
		    <input type="text" name="phone" placeholder="请输入手机号">
		</span>
		<p>
		<input type="button" class="change"  value="切换类型" placeholder="切换类型"  @click="btnClick">
		</p>
        <p><input type="password" name="pwd"  placeholder="密码"></p>
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
    	  if (this.loginType == 'uname') {
              this.loginType = 'email';
          } else if(this.loginType == 'email'){
              this.loginType = 'phone';
          }else if(this.loginType == 'phone'){
        	 // alert(111);
        	  this.loginType = 'uname';
          }
          return this.loginType;
      
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