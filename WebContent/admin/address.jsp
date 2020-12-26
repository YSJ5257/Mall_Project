<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>最家</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/mygxin.css"/>
</head>
<body><!------------------------------head------------------------------>
<div id="app">
<div  class="head ding">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><a href="index.jsp"><img src="img/logo.png"/></a></h1>
            <div class="fr clearfix" id="top1"><p class="fl"><a href="login" id="login">登录</a><a href="reg"
                                                                                                      id="reg">注册</a>
            </p>
                <form action="#" method="get" class="fl"><input type="text" placeholder="搜索"/><input type="button"/>
                </form>
                <div class="btn fl clearfix"><a href="mygxin"><img src="img/grzx.png"/></a><a href="#" class="er1"><img
                        src="img/ewm.png"/></a><a href="cart"><img src="img/gwc.png"/></a>
                    <p><a href="#"><img src="img/smewm.png"/></a></p></div>
            </div>
        </div>
        <ul class="clearfix" id="bott">
            <li><a href="../index.jsp">首页</a></li>
            <li><a href="#">所有商品</a>
                <div class="sList">
                    <div class="wrapper  clearfix"><a href="paint">
                        <dl>
                            <dt><img src="img/nav1.jpg"/></dt>
                            <dd>浓情欧式</dd>
                        </dl>
                    </a><a href="paint">
                        <dl>
                            <dt><img src="img/nav2.jpg"/></dt>
                            <dd>浪漫美式</dd>
                        </dl>
                    </a><a href="paint">
                        <dl>
                            <dt><img src="img/nav3.jpg"/></dt>
                            <dd>雅致中式</dd>
                        </dl>
                    </a><a href="paint">
                        <dl>
                            <dt><img src="img/nav6.jpg"/></dt>
                            <dd>简约现代</dd>
                        </dl>
                    </a><a href="paint">
                        <dl>
                            <dt><img src="img/nav7.jpg"/></dt>
                            <dd>创意装饰</dd>
                        </dl>
                    </a></div>
                </div>
            </li>
            <li><a href="flowerDer">装饰摆件</a>
                <div class="sList2">
                    <div class="clearfix"><a href="proList">干花花艺</a><a href="vase_proList">花瓶花器</a></div>
                </div>
            </li>
            <li><a href="decoration">布艺软饰</a>
                <div class="sList2">
                    <div class="clearfix"><a href="zbproList">桌布罩件</a><a href="bzproList">抱枕靠垫</a></div>
                </div>
            </li>
            <li><a href="paint">墙式壁挂</a></li>
            <li><a href="perfume">蜡艺香薰</a></li>
            <li><a href="idea">创意家居</a></li>
        </ul>
    </div>
</div><!------------------------------idea------------------------------>
<div class="address mt">
    <div class="wrapper clearfix"><a href="index.jsp" class="fl">首页</a><span>/</span><a
            href="mygxin">个人中心</a><span>/</span><a href="address" class="on">地址管理</a></div>
</div><!------------------------------Bott------------------------------>
<div class="Bott">
    <div class="wrapper clearfix">
        <div class="zuo fl">
            <h3><a href="#"><img src="img/tx.png"/></a>
                <p class="clearfix"><span class="fl">[羊羊羊]</span><span class="fr">[退出登录]</span></p></h3>
            <div><h4>我的交易</h4>
                <ul>
                    <li><a href="cart">我的购物车</a></li>
                    <li><a href="myorderq">我的订单</a></li>
                    <li><a href="myprod">评价晒单</a></li>
                </ul>
                <h4>个人中心</h4>
                <ul>
                    <li><a href="mygxin">我的中心</a></li>
                    <li class="on"><a href="address">地址管理</a></li>
                </ul>
                <h4>账户管理</h4>
                <ul>
                    <li><a href="mygrxx">个人信息</a></li>
                    <li><a href="remima">修改密码</a></li>
                </ul>
            </div>
        </div>
        <div class="you fl"><h2>收货地址</h2>
            <div class="add">
                <div><a href="javascript:void(0)" @click="addButton" id="addxad"><img src="img/jia.png"/></a><span>添加新地址</span></div>
            	<div id="dizhi" v-for="item in addressList" @mouseleave="mouseleave($event)" @mouseenter="mouseenter($event)" ><p>{{item.consignee_name}}</p>
                    <p>{{item.consignee_phone}}</p>
                    <p>{{item.provincer_name}}  {{  item.city_name}}   {{  item.quxian_name}}</p>
                    <p>{{item.minute_adress}}（{{item.postcode_adress}}）</p>
                    <p style="display: none" id="dizhi_p" class="addp"><a href="javascript:void(0)" @click="modifyAddress(item)"  id="readd">修改</a><a href="javascript:void(0)" @click="delAddress(item.adress_id)" id="delete">删除</a></p>
           		 </div>
        </div>
        
    </div>
</div><!--编辑弹框--><!--遮罩-->
</div>
<div class="mask"></div>
<div class="adddz">
    <form onsubmit="return false" method="post" id="addForm">
    	<input name="user_id" type="hidden" value="${user.user_id}" />
    	<input name="adress_id" type="hidden" v-model="adress_id" />
    	<input name="consignee_name" v-model="consignee_name" type="text" placeholder="姓名"  class="on"/>
    	<input name="consignee_phone" v-model="consignee_phone" type="text" placeholder="手机号"/>
        <div class="city">
        	<select id="s_province"  name="provincer_name"></select> 
			<select id="s_city"  name="city_name" ></select> 
			<select id="s_county"   name="quxian_name"></select>
        </div>
        <textarea name="minute_adress" v-model="minute_adress" rows="" cols="" placeholder="详细地址"></textarea>
        <input name="postcode_adress" v-model="postcode_adress" type="text" placeholder="邮政编码"/>
        <div class="bc"><input @click="addAddress" type="submit" value="保存"/><input type="button" value="取消"/></div>
    </form>
</div><!--返回顶部-->

<div class="gotop"><a href="cart">
    <dl>
        <dt><img src="img/gt1.png"/></dt>
        <dd>去购<br/>物车</dd>
    </dl>
</a><a href="#" class="dh">
    <dl>
        <dt><img src="img/gt2.png"/></dt>
        <dd>联系<br/>客服</dd>
    </dl>
</a><a href="mygxin">
    <dl>
        <dt><img src="img/gt3.png"/></dt>
        <dd>个人<br/>中心</dd>
    </dl>
</a><a href="#" class="toptop" style="display: none">
    <dl>
        <dt><img src="img/gt4.png"/></dt>
        <dd>返回<br/>顶部</dd>
    </dl>
</a>
    <p>400-800-8200</p></div><!--footer-->
<div class="footer">
    <div class="top">
        <div class="wrapper">
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot1.png"/></a><span class="fl">7天无理由退货</span>
            </div>
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot2.png"/></a><span class="fl">15天免费换货</span>
            </div>
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot3.png"/></a><span class="fl">满599包邮</span>
            </div>
            <div class="clearfix"><a href="#2" class="fl"><img src="img/foot4.png"/></a><span class="fl">手机特色服务</span>
            </div>
        </div>
    </div>
    <p class="dibu">最家家居&copy;2013-2017公司版权所有 京ICP备080100-44备0000111000号<br/>
        违法和不良信息举报电话：400-800-8200，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p></div>
</div>
<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/user.js" type="text/javascript" charset="utf-8"></script>

<script type="text/javascript" src="js/vue.min.js"></script>
<script type="text/javascript" src="js/axios.js"></script>
<script type="text/javascript">
	var app=new Vue({
		el:"#app",
		data:{
			addressList:[],
			flag:true,
			adress_id:"",
			consignee_name:"",
			consignee_phone:"",
			minute_adress:"",
			postcode_adress:""
		},
		methods:{
			addAddress:function(){
				var info=$("#addForm").serialize();
				if(this.flag){
					axios.get('addressAjax',{
						params:{jsonData: this.formToJson(info),"method":"addAdderss"}
					}).then( (ret) =>{
						this.init();
					});
				}else{
					axios.get('addressAjax',{
						params:{jsonData: this.formToJson(info),"method":"modifyAdderss"}
					}).then( (ret) =>{
						this.init();
					});
				}
				
			},
			init:function(){
				axios.get('addressAjax',{
					params:{method:"getAddress",jsonData:""}
				}).then( (ret) =>{
					this.addressList=ret.data;
				});
			},
			mouseenter:function(event){
				$(event.target.lastElementChild).css("display","block");
			},
			mouseleave:function(event){
				$(event.target.lastElementChild).css("display","none");
			}, 
			modifyAddress:function(obj){
				$(".mask").show();
		        $(".adddz").show();
		        this.consignee_name=obj.consignee_name;
		        this.consignee_phone=obj.consignee_phone;
		        this.minute_adress=obj.minute_adress;
		        this.postcode_adress=obj.postcode_adress;
		        this.adress_id=obj.adress_id;
		        this.flag=false;
			},
			delAddress:function(data){
				axios.get('addressAjax',{
					params:{method:"delAddress",jsonData:data}
				}).then( (ret) =>{
					this.init();
				});
			},
			addButton:function(){
				$(".mask").show();
		        $(".adddz").show();
		        this.flag=true;
		        this.consignee_name="";
		        this.consignee_phone="";
		        this.minute_adress="";
		        this.postcode_adress="";
			},
			//表单序列化值转换为json对象
			formToJson:function(data){
				data= decodeURIComponent(data,true);//防止中文乱码  
			    data = data.replace(/&/g, "','" );
			    data = data.replace(/=/g, "':'" );
			    data = "{'" +data + "'}" ;;
			    return data;
			}
		},
		created:function(){
			this.init();
		}
	});
</script>
<script class="resources library" src="js/area.js" type="text/javascript"></script>
<script type="text/javascript">_init_area();</script>
<script type="text/javascript">
	$(function(){
		var showArea = function(){
			$('#show').innerHTML = "<h3>省" + $('#s_province').value + " - 市" + 	
			$('#s_city').value + " - 县/区" + 
			$('#s_county').value + "</h3>"
		};
		$('#s_county').attr('onchange','showArea');
		
	})
	
</script>



</body>
</html>