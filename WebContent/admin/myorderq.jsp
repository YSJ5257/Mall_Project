<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>最家</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet" type="text/css" href="css/myorder.css" />
<style type="text/css">
	.Receiving{
		color:#A10000;
	}
	
</style>
</head>
<body>
	<!------------------------------head------------------------------>
	<div id="app">
		<div class="head ding">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl">
						<a href="index.jsp"><img src="img/logo.png" /></a>
					</h1>
					<div class="fr clearfix" id="top1">
						<p class="fl">
							<a href="#" id="login">登录</a><a href="#" id="reg">注册</a>
						</p>
						<form action="#" method="get" class="fl">
							<input type="text" placeholder="搜索" /><input type="button" />
						</form>
						<div class="btn fl clearfix">
							<a href="mygxin"><img src="img/grzx.png" /></a><a href="#"
								class="er1"><img src="img/ewm.png" /></a><a href="cart"><img
								src="img/gwc.png" /></a>
							<p>
								<a href="#"><img src="img/smewm.png" /></a>
							</p>
						</div>
					</div>
				</div>
				<ul class="clearfix" id="bott">
					<li><a href="index.jsp">首页</a></li>
					<li><a href="#">所有商品</a>
						<div class="sList">
							<div class="wrapper  clearfix">
								<a href="paint">
									<dl>
										<dt>
											<img src="img/nav1.jpg" />
										</dt>
										<dd>浓情欧式</dd>
									</dl>
								</a><a href="paint">
									<dl>
										<dt>
											<img src="img/nav2.jpg" />
										</dt>
										<dd>浪漫美式</dd>
									</dl>
								</a><a href="paint">
									<dl>
										<dt>
											<img src="img/nav3.jpg" />
										</dt>
										<dd>雅致中式</dd>
									</dl>
								</a><a href="paint">
									<dl>
										<dt>
											<img src="img/nav6.jpg" />
										</dt>
										<dd>简约现代</dd>
									</dl>
								</a><a href="paint">
									<dl>
										<dt>
											<img src="img/nav7.jpg" />
										</dt>
										<dd>创意装饰</dd>
									</dl>
								</a>
							</div>
						</div></li>
					<li><a href="flowerDer">装饰摆件</a>
						<div class="sList2">
							<div class="clearfix">
								<a href="proList">干花花艺</a><a href="vase_proList">花瓶花器</a>
							</div>
						</div></li>
					<li><a href="decoration">布艺软饰</a>
						<div class="sList2">
							<div class="clearfix">
								<a href="zbproList">桌布罩件</a><a href="bzproList">抱枕靠垫</a>
							</div>
						</div></li>
					<li><a href="paint">墙式壁挂</a></li>
					<li><a href="perfume">蜡艺香薰</a></li>
					<li><a href="idea">创意家居</a></li>
				</ul>
			</div>
		</div>
		<!------------------------------idea------------------------------>
		<div class="address mt">
			<div class="wrapper clearfix">
				<a href="#" class="fl">首页</a><span>/</span><a href="mygxin">个人中心</a><span>/</span><a
					href="myorderq" class="on">我的订单</a>
			</div>
		</div>
		<!------------------------------Bott------------------------------>
		<div class="Bott">
			<div class="wrapper clearfix">
				<div class="zuo fl">
					<h3>
						<a href="#"><img src="img/tx.png" /></a>
						<p class="clearfix">
							<span class="fl">[羊羊羊]</span><span class="fr">[退出登录]</span>
						</p>
					</h3>
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="cart">我的购物车</a></li>
							<li><a href="myorderq">我的订单</a></li>
							<li><a href="myprod">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li><a href="mygxin">我的中心</a></li>
							<li><a href="address">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li class="on"><a href="mygrxx">个人信息</a></li>
							<li><a href="remima">修改密码</a></li>
						</ul>
					</div>
				</div>
				<div class="you fl">
					<div class="my clearfix">
						<h2 class="fl">我的订单</h2>
						<a href="#" class="fl">请谨防钓鱼链接或诈骗电话，了解更多&gt;</a>
					</div>
					<div class="dlist clearfix">
						<ul class="fl clearfix" id="wa">
							<li class="on"><a href="#2" @click="allOrders">全部有效订单</a></li>
							<li><a href="#2" @click="noPayment">待支付</a></li>
							<li><a href="#2l" @click="noShipping">待发货</a></li>
							<li><a href="#2" @click="waitReceiving">待收货</a></li>
							<li><a href="#2" @click="noComment">待评价</a></li>
						</ul>
						<form action="#" method="get" class="fr clearfix">
							<input type="text" name="" id="" value=""
								placeholder="请输入商品名称、订单号" /><input type="button" name="" id=""
								value="" />
						</form>
					</div>
				
<!-- ########################################订单遍历##################################################### -->
					
					<div class="dkuang clearfix deng" v-for="(item,index) in myOrderList" >
						<p class="one fl" :class="{'Receiving':true}">{{item.status}}</p>
						<div class="clearfix" v-if="['待收货'].includes(item.status)">
							<div class="fl vewwl"  @mouseover="mouseover(index)" @mouseleave="mouseleave()">
								<a href="wuliu" class="ckwl"  >查看物流</a>
								<div class="wuliu" v-show="show===index"  @mouseover="mouseover(index)">
									<h4>圆通速递：858888888888888</h4>
									<ul>
										<li><p>妥投投递并签收，已签收。签收人：本人签收</p>
											<p>2016-12-03 17:30:00</p></li>
										<li><p>深圳市南油速递营销部安排投递（投递员姓名：六六六。联系电话：14243452522;</p>
											<p>2016-12-03 08:50:00</p></li>
										<li><p>到达广东省邮政速递物流有限公司深圳航空邮件处理中心处理中心（经转）</p>
											<p>2016-12-03 02:20:00</p></li>
										<li>以上为最新跟踪信息<a href="wuliu">查看全部</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="word clearfix">
							<ul class="fl clearfix">
								<li>{{item.create_time}}</li>
								<li>{{item.consignee_name}}</li>
								<li>订单号:{{item.order_number}}</li>
								<li>{{item.payment_type}}</li>
							</ul>
							<p class="fr">
								订单金额：<span>{{item.total_fee}}</span>元
							</p>
						</div>
						<div class="shohou clearfix">
							<a href="#" class="fl"><img :src="item.pic_path"/></a>
							<p class="fl">
								<a href="#">{{item.title}}</a><a href="#">¥{{item.price}}×{{item.num}}</a>
							</p>
							<p class="fr"  v-if="item.status==='待支付'">
								<a href="order" class="tradingStatus">立即支付</a>
								<a href="orderxq">订单详情</a>
							</p>
							<p class="fr"  v-else-if="item.status==='交易成功'">
								<a href="order" v-if="item.buy_rate===0" class="tradingStatus">去评论</a>
								<a href="order" v-if="item.buy_rate===1">查看评论</a>
								<a href="orderxq">订单详情</a>
							</p>
							<p class="fr"  v-else>
								<a href="order" class="tradingStatus">确认收货</a>
								<a href="orderxq">订单详情</a>
							</p>
						</div>
					</div>
					
					<div class="fenye clearfix">
						<a href="#"><img src="img/zuo.jpg" /></a><a href="#">1</a><a
							href="#"><img src="img/you.jpg" /></a>
					</div>
				</div>
			</div>
		</div>
		<!--返回顶部-->
		<div class="gotop">
			<a href="cart">
				<dl>
					<dt>
						<img src="img/gt1.png" />
					</dt>
					<dd>
						去购<br />物车
					</dd>
				</dl>
			</a><a href="#" class="dh">
				<dl>
					<dt>
						<img src="img/gt2.png" />
					</dt>
					<dd>
						联系<br />客服
					</dd>
				</dl>
			</a><a href="mygxin">
				<dl>
					<dt>
						<img src="img/gt3.png" />
					</dt>
					<dd>
						个人<br />中心
					</dd>
				</dl>
			</a><a href="#" class="toptop" style="display: none">
				<dl>
					<dt>
						<img src="img/gt4.png" />
					</dt>
					<dd>
						返回<br />顶部
					</dd>
				</dl>
			</a>
			<p>400-800-8200</p>
		</div>
		<!--footer-->
		<div class="footer">
			<div class="top">
				<div class="wrapper">
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot1.png" /></a><span
							class="fl">7天无理由退货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot2.png" /></a><span
							class="fl">15天免费换货</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot3.png" /></a><span
							class="fl">满599包邮</span>
					</div>
					<div class="clearfix">
						<a href="#2" class="fl"><img src="img/foot4.png" /></a><span
							class="fl">手机特色服务</span>
					</div>
				</div>
			</div>
			<p class="dibu">
				最家家居&copy;2013-2017公司版权所有 京ICP备080100-44备0000111000号<br />
				违法和不良信息举报电话：188-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试
			</p>
		</div>
	</div>
	<script src="js/jquery-1.12.4.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/user.js" type="text/javascript" charset="utf-8">
</script>
	<script type="text/javascript" src="js/vue.min.js"></script>
	<script type="text/javascript" src="js/axios.js"></script>
	<script type="text/javascript">
	const app=new Vue({
		el:"#app",
		data:{
			myOrderList:[],
			show:-1,
			ordersStatus:""
		},
		methods:{
			init:function(){
				axios.get('myOderAjax',{
					params:{method:"getMyOrder",jsonData:""}
				}).then( (ret) =>{
					this.myOrderList=ret.data;
				});
			},
			mouseover:function(index){
				this.show=index;
			},
			mouseleave:function(){
				this.show=-1;
			},
			allOrders:function(){//全部有效订单
				
			},
			noPayment:function(){//未支付
				
			},
			noShipping:function(){//未发货
				
			},
			waitReceiving:function(){//未收货
				
			},
			noComment:function(){//未评论
				
			}
		},
		
		created:function(){
			this.init();
		}
	});
</script>
</body>
</html>