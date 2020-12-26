<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>最家</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet" type="text/css" href="css/idea.css" />
</head>
<body>
	<!------------------------------head------------------------------>
	<div id="app">
		<div class="head">
			<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl">
						<a href="index"><img src="img/logo.png" /></a>
					</h1>
					<div class="fr clearfix" id="top1">
						<p class="fl">
							<a href="login" id="login">登录</a><a href="reg" id="reg">注册</a>
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
		<div class="address">
			<div class="wrapper clearfix">
				<a href="index" class="fl">首页</a><span>/</span><a href="idea"
					class="on">创意家居</a>
			</div>
		</div>
		<!------------------------------imgList1------------------------------>
		<div class="imgList1">
			<div class="wrapper">
				<div class="box1">
					<a href="proDetail" class="banner"><img src="img/idea1.jpg" /></a>
					<ul>
						<li  v-for="(item,index) in list1.slice(0,3)"><a
							:href="selectGoods(item.goods_id)">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>￥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul>
					<ul>
						<li  v-for="(item,index) in list1.slice(3,6)"><a
							:href="selectGoods(item.goods_id)">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>￥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul>
					<ul>
						<li  v-for="(item,index) in list1.slice(6,9)"><a
							:href="selectGoods(item.goods_id)">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>￥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul>
				</div>
				<h2>
					<img src="img/ih5.jpg" />
				</h2>
				<div class="box2">
					<a href="proDetail" class="banner"><img src="img/idea22.jpg" /></a>
					<ul>
						<li  v-for="(item,index) in list2.slice(0,4)"><a
							:href="selectGoods(item.goods_id)" class="on">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>¥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul>
					 <ul>
						<li  v-for="(item,index) in list2.slice(4,9)"><a
							:href="selectGoods(item.goods_id)" class="on">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>¥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul> 

				</div>
				<h2>
					<img src="img/ih6.jpg" />
				</h2>
				<div class="box3">
					<ul>
						<li  v-for="(item,index) in list3.slice(0,4)"><a
							:href="selectGoods(item.goods_id)" class="on">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>¥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul>
					 <ul>
						<li  v-for="(item,index) in list3.slice(4,9)"><a
							:href="selectGoods(item.goods_id)" class="on">
								<dl>
									<dt>
										<img :src="item.goods_photo" />
									</dt>
									<dd>{{item.goods_name}}</dd>
									<dd>¥{{item.goods_price}}</dd>
								</dl>
						</a></li>
					</ul> 
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
			</a><a href="#" class="toptop" style="display: none;">
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
				违法和不良信息举报电话：400-800-8200，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试
			</p>
		</div>
	</div>
	<script src="js/jquery-1.12.4.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
	<script src="./js/jquery-1.8.2.min.js" type="text/javascript"></script>
	<script src="./js/vue.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/axios.js"></script>
	<script type="text/javascript">
 var app = new Vue({
	 el:'#app',
	 data:{
		 list:[],
		 list1:[],
		 list2:[],
		 list3:[],
	 },
	 methods:{
		 init:function(){
				axios.get("ideaServlet2").then( (ret)=>{
					this.list=ret.data;
					this.list1=this.list[0];
					this.list2=this.list[1];
					this.list3=this.list[2];
				})
		 },
		 selectGoods:function(id){
			 /* http://localhost/Mall_Project/proDetail */
			return 'http://localhost/Mall_Project/proDetail?goodsId='+id;
		 }  
	 },
		created:function(){
			this.init();
		}
		
	 
 });
</script>
</body>
</html>