<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body><!-------------------reg-------------------------->
<div class="reg" id="app">
    <form action="userRegServlet" method="post"><h1><a href="index.jsp"><img src="img/temp/logo.png"></a></h1>
        <p>用户注册</p>
        <p><input type="text" name="emails" value="" placeholder="请输入邮箱"></p>
        <p><input type="text" name="pwds" value="" placeholder="请输入密码"></p>
        <p><input type="text" name="pwdes" value="" placeholder="请确认密码"></p>
        <p class="txtL txt"><input class="code" type="text" name="verification" value="" placeholder="验证码"><img
                src="img/temp/code.jpg"></p>
        <p><input type="submit" name="reg" value="注册"  @click="regs"></p>
        <p class="txtL txt">完成此注册，即表明您同意了我们的<a href="#">
            <使用条款和隐私策略>
        </a></p>
        <p class="txt"><a href="login"><span></span>已有账号登录</a></p>
        <!--<a href="#" class="off"><img src="img/temp/off.png"></a>--></form>
</div>
<script src="./js/jquery-1.8.2.min.js" type="text/javascript"></script>
<script src="./js/vue.min.js" type="text/javascript"></script>
<script type="text/javascript">
	var app = new Vue({
	el:'#app',
	data:{
		emails:'',
		pwds:'',
		pwdes:'',
		verification:''
	},
	methods:{
		regs:function(){
			ajax({
				url:"userRegServlet",
				type:"post",
				data:{
					emails:'',
					pwds:'',
					pwdes:'',
					verification:''
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