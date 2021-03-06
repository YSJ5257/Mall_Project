<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>order</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/proList.css"/>
    <link rel="stylesheet" type="text/css" href="css/mygxin.css"/>
</head>
<body><!----------------------------------------order------------------>
<div id="app">
<div class="head ding">
    <div class="wrapper clearfix">
        <div class="clearfix" id="top"><h1 class="fl"><a href="index.jsp"><img src="img/logo.png"/></a></h1>
            <div class="fr clearfix" id="top1"><p class="fl"><a href="#" id="login">登录</a><a href="#" id="reg">注册</a>
            </p>
                <form action="#" method="get" class="fl"><input type="text" placeholder="搜索"/><input type="button"/>
                </form>
                <div class="btn fl clearfix"><a href="mygxin"><img src="img/grzx.png"/></a><a href="#" class="er1"><img
                        src="img/ewm.png"/></a><a href="cart"><img src="img/gwc.png"/></a>
                    <p><a href="#"><img src="img/smewm.png"/></a></p></div>
            </div>
        </div>
        <ul class="clearfix" id="bott">
            <li><a href="index.jsp">首页</a></li>
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
</div>
<div class="order cart mt"><!-----------------site------------------->
    <div class="site"><p class="wrapper clearfix"><span class="fl">订单确认</span><img class="top"
                                                                                   src="img/temp/cartTop02.png"></p>
    </div><!-----------------orderCon------------------->
    <div class="orderCon wrapper clearfix">
        <div class="orderL fl"><!--------h3----------------><h3>收件信息<a href="address" class="fr">地址管理</a></h3>
            <!--------addres---------------->
            
            <div class="addres clearfix">
                <div @click="checkedAddress(index,item)" :key="index" :class="{'addre':true,'fl':true,'on':index==current}"  v-for="(item,index) in addressList" class="clearfix">
                    <div class="tit clearfix"><p class="fl">{{item.consignee_name }}</p></div>
                    <div class="addCon"><p>{{item.provincer_name }}&nbsp;{{item.city_name }}&nbsp;{{item.quxian_name }}&nbsp;{{item.minute_adress }}</p>
                        <p>{{item.consignee_phone }}</p></div>
                	</div>
            </div>
             <div class="holder"></div>
            <h3>支付方式</h3><!--------way---------------->
            <div class="way clearfix">
	            <img @click="way('支付宝支付')" class="on" src="img/temp/way01.jpg">
	            <img @click="way('微信支付')" src="img/temp/way02.jpg">
	            <img @click="way('银联宝支付')" src="img/temp/way03.jpg">
	            <img @click="way('货到付款')" src="img/temp/way04.jpg">
            </div>
            <h3>选择快递</h3><!--------dis---------------->
            <div class="dis clearfix"><span class="on" @click="shipping('顺丰快递')" >顺风快递</span><span  @click="shipping('百世汇通')">百世汇通</span><span  @click="shipping('圆通快递')">圆通快递</span><span  @click="shipping('中通快递')">中通快递</span>
            </div>
        </div>
        <div class="orderR fr">
            <div class="msg"><h3>订单内容<a href="cart" class="fr">返回购物车</a></h3><!--------ul---------------->
 
 			<!-- ##############################订单商品的遍历#################################### -->
                <c:forEach items="${indentGoods }" var="item">
                <ul class="clearfix">
                    <li class="fl"><img style="width:87px" src="${item.specification_photo }"></li>
                    <li class="fl"><p>${item.goods_describe }</p>
                        <p>颜色分类：${item.specification_name }</p>
                        <p>数量：${item.specification_number }</p></li>
                    <li id="goodsPrice" class="fr">￥${item.specification_price*item.specification_number }</li>
                </ul>
                </c:forEach>
            </div><!--------tips---------------->
            <div class="tips"><p><span class="fl">商品金额：</span><span class="fr">￥${total }</span></p>
                <p><span class="fl">优惠金额：</span><span class="fr">￥0.00</span></p>
                <p><span class="fl">运费：</span><span class="fr">免运费</span></p></div><!--------tips count---------------->
            <div class="count tips"><p><span class="fl">合计：</span><span class="fr">￥${total }</span></p></div>
            <a href="ok" class="pay" @click="payment">去支付</a></div>
    </div>
</div>
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
</a><a href="#" class="toptop" style="display: none;">
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
        违法和不良信息举报电话：188-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</p></div>
</div>

<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="js/vue.min.js"></script>
<script src="js/axios.js" type="text/javascript"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
	
	const app=new Vue({
		el:"#app",
		data:{
			current:0,
			addressList:"",
			address:"",
			payment_type:"支付宝支付",
			shipping_name:"顺丰快递"
		},
		methods:{
			init:function(){
				
				axios.get("addressAjax",{
					params:{method:"getAddress",jsonData:""}
				}).then( (ret) =>{
					this.addressList=ret.data;
					this.address=this.addressList[0];
				});
			},
			checkedAddress:function(index,item){
				this.current=index;
				this.address=item;
			},
			payment:function(){
				axios.get("orderAjax",{
					params:{
						address:this.address,
						payment_type:this.payment_type,
						shipping_name:this.shipping_name
					}
				}).then( (ret) =>{
					
				});
			},
			way:function(data){
				this.payment_type=data;
			},
			shipping:function(data){
				this.shipping_name=data;
			}
		},
		created:function(){
			this.init();
		}
	});
 	
</script>



</body>
</html>