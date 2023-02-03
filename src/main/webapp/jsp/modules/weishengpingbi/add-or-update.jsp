<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑卫生评比</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>卫生评比管理</span></li>
								<li class="breadcrumb-item active"><span>编辑卫生评比</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">卫生评比信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>寝室号</label>
										<input name="qinshihao" id="qinshihao" name="qinshihao" class="form-control" placeholder="寝室号">
									</div>
									<div class="form-group col-md-6">
										<label>物品摆放</label>
										<select id="wupinbaifangSelect" name="wupinbaifang" class="form-control">
												<option value=""></option>
												<option class="wupinbaifangOption" value="0">
													0
												</option>
												<option class="wupinbaifangOption" value="1">
													1
												</option>
												<option class="wupinbaifangOption" value="2">
													2
												</option>
												<option class="wupinbaifangOption" value="3">
													3
												</option>
												<option class="wupinbaifangOption" value="4">
													4
												</option>
												<option class="wupinbaifangOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>地面卫生</label>
										<select id="dimianweishengSelect" name="dimianweisheng" class="form-control">
												<option value=""></option>
												<option class="dimianweishengOption" value="0">
													0
												</option>
												<option class="dimianweishengOption" value="1">
													1
												</option>
												<option class="dimianweishengOption" value="2">
													2
												</option>
												<option class="dimianweishengOption" value="3">
													3
												</option>
												<option class="dimianweishengOption" value="4">
													4
												</option>
												<option class="dimianweishengOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>床面评分</label>
										<select id="chuangmianpingfenSelect" name="chuangmianpingfen" class="form-control">
												<option value=""></option>
												<option class="chuangmianpingfenOption" value="0">
													0
												</option>
												<option class="chuangmianpingfenOption" value="1">
													1
												</option>
												<option class="chuangmianpingfenOption" value="2">
													2
												</option>
												<option class="chuangmianpingfenOption" value="3">
													3
												</option>
												<option class="chuangmianpingfenOption" value="4">
													4
												</option>
												<option class="chuangmianpingfenOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>墙面评分</label>
										<select id="qiangmianpingfenSelect" name="qiangmianpingfen" class="form-control">
												<option value=""></option>
												<option class="qiangmianpingfenOption" value="0">
													0
												</option>
												<option class="qiangmianpingfenOption" value="1">
													1
												</option>
												<option class="qiangmianpingfenOption" value="2">
													2
												</option>
												<option class="qiangmianpingfenOption" value="3">
													3
												</option>
												<option class="qiangmianpingfenOption" value="4">
													4
												</option>
												<option class="qiangmianpingfenOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>内务评分</label>
										<select id="neiwupingfenSelect" name="neiwupingfen" class="form-control">
												<option value=""></option>
												<option class="neiwupingfenOption" value="0">
													0
												</option>
												<option class="neiwupingfenOption" value="1">
													1
												</option>
												<option class="neiwupingfenOption" value="2">
													2
												</option>
												<option class="neiwupingfenOption" value="3">
													3
												</option>
												<option class="neiwupingfenOption" value="4">
													4
												</option>
												<option class="neiwupingfenOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>窗户评分</label>
										<select id="chuanghupingfenSelect" name="chuanghupingfen" class="form-control">
												<option value=""></option>
												<option class="chuanghupingfenOption" value="0">
													0
												</option>
												<option class="chuanghupingfenOption" value="1">
													1
												</option>
												<option class="chuanghupingfenOption" value="2">
													2
												</option>
												<option class="chuanghupingfenOption" value="3">
													3
												</option>
												<option class="chuanghupingfenOption" value="4">
													4
												</option>
												<option class="chuanghupingfenOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>桌凳评分</label>
										<select id="zhuodengpingfenSelect" name="zhuodengpingfen" class="form-control">
												<option value=""></option>
												<option class="zhuodengpingfenOption" value="0">
													0
												</option>
												<option class="zhuodengpingfenOption" value="1">
													1
												</option>
												<option class="zhuodengpingfenOption" value="2">
													2
												</option>
												<option class="zhuodengpingfenOption" value="3">
													3
												</option>
												<option class="zhuodengpingfenOption" value="4">
													4
												</option>
												<option class="zhuodengpingfenOption" value="5">
													5
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>整体效果</label>
										<input name="zhengtixiaoguo" id="zhengtixiaoguo" name="zhengtixiaoguo" class="form-control" placeholder="整体效果">
									</div>
									<div class="form-group col-md-6">
										<label>评选结果</label>
										<select id="pingxuanjieguoSelect" name="pingxuanjieguo" class="form-control">
												<option value=""></option>
												<option class="pingxuanjieguoOption" value="优秀">
													优秀
												</option>
												<option class="pingxuanjieguoOption" value="良好">
													良好
												</option>
												<option class="pingxuanjieguoOption" value="不合格">
													不合格
												</option>
										</select>	
									</div>	
									<div class="form-group col-md-6">
										<label>检查日期</label>
										<div id="jianchariqiDate" class="input-append date form_datetime">
											<input id="jianchariqi-input" name="jianchariqi" size="15" type="text" readonly>
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
										
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">取消</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../static/utils.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "weishengpingbi";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};



		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "weishengpingbi/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
		}  
		//取消 
		function cancel() {
			window.location.href="list.jsp";
		}
		function getQueryString(name) { 
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
			var r = window.location.search.substr(1).match(reg); 
			if (r != null) return unescape(r[2]); 
			return null; 
		}

		// 表单提交
		function submit() {

			var crossFlag = getQueryString("cross");
			if(validform() ==true && compare() == true){
				if(crossFlag) {
				}
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(crossFlag) {
					var statusColumnName = window.sessionStorage.getItem('statusColumnName'); 
					var statusColumnValue = window.sessionStorage.getItem('statusColumnValue'); 
					var obj = JSON.parse(window.sessionStorage.getItem('crossObj'));
					if(statusColumnName!='') {
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}
							}
							var table = window.sessionStorage.getItem('crossTableName');
							httpJson(crossTableName + "/update","POST",obj,(res)=>{
								if(res.code == 0){
									console.log('更新属性成功');
								}
							});   
						} else  {
							crossuserid = Number(window.sessionStorage.getItem('userid'));
							crossrefid = obj["id"];
							crossoptnum = window.sessionStorage.getItem('statusColumnName');
							crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					data.crossuserid=crossuserid;
					data.crossrefid=crossrefid;
					http("weishengpingbi/page","GET",{
						page:1,
						limit:10,
						crossuserid:data.crossuserid,
						crossrefid:data.crossrefid,			
					},(res)=>{
						if(res.data.total >= crossoptnum){
							alert(window.sessionStorage.getItem('tips'));
							return false;
						} else {
							httpJson("weishengpingbi/"+urlParam,"POST",data,(res)=>{
								if(res.code == 0){
									window.sessionStorage.removeItem('id');
									let flag = true;
									if(crossFlag) {
									}

									if(flag){
										alert(successMes);
									}
									if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
										window.sessionStorage.removeItem('onlyme');
										window.location.href="${pageContext.request.contextPath}/index.jsp";
									}else{
										window.location.href="list.jsp";
									}
									
								}
							});
						}
					});
				} else {
					httpJson("weishengpingbi/"+urlParam,"POST",data,(res)=>{
						if(res.code == 0){
							window.sessionStorage.removeItem('id');
							let flag = true;
							if(crossFlag) {
							}

							if(flag){
								alert(successMes);
							}
							if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
								window.sessionStorage.removeItem('onlyme');
								window.location.href="${pageContext.request.contextPath}/index.jsp";
							}else{
								window.location.href="list.jsp";
							}
							
						}
					});
				}
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
		}  

		// 获取富文本框内容
		function getContent(){
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    wupinbaifang: {
					},
				    dimianweisheng: {
					},
				    chuangmianpingfen: {
					},
				    qiangmianpingfen: {
					},
				    neiwupingfen: {
					},
				    chuanghupingfen: {
					},
				    zhuodengpingfen: {
					},
				    zhengtixiaoguo: {
					},
				    pingxuanjieguo: {
					},
				    jianchariqi: {
					},
				},
				messages: {
					wupinbaifang: {
					},
					dimianweisheng: {
					},
					chuangmianpingfen: {
					},
					qiangmianpingfen: {
					},
					neiwupingfen: {
					},
					chuanghupingfen: {
					},
					zhuodengpingfen: {
					},
					zhengtixiaoguo: {
					},
					pingxuanjieguo: {
					},
					jianchariqi: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("weishengpingbi/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												//注册表单验证
						$(validform());	
					}
				});
			}else{



		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
			$("#jianchariqi-input").val(getCurDate());
			$("#jianchariqiDate").datetimepicker({ 
				minView: "month",
				autoclose: true,
				format:'yyyy-mm-dd',
				language:'zh-CN',
			});

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
		}		
		function calculationSE(colName){
			//单列求和接口
			http("weishengpingbi"+colName,"GET",{
				tableName: "weishengpingbi",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){
				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#qinshihao").val(ruleForm.qinshihao);	
			var wupinbaifangOptions = document.getElementsByClassName("wupinbaifangOption");
			for(var wupinbaifangCount = 0; wupinbaifangCount < wupinbaifangOptions.length;wupinbaifangCount++){
				if(wupinbaifangOptions[wupinbaifangCount].getAttribute('value') == ruleForm.wupinbaifang){
					wupinbaifangOptions[wupinbaifangCount].setAttribute('selected','selected');
				}
			}
			var dimianweishengOptions = document.getElementsByClassName("dimianweishengOption");
			for(var dimianweishengCount = 0; dimianweishengCount < dimianweishengOptions.length;dimianweishengCount++){
				if(dimianweishengOptions[dimianweishengCount].getAttribute('value') == ruleForm.dimianweisheng){
					dimianweishengOptions[dimianweishengCount].setAttribute('selected','selected');
				}
			}
			var chuangmianpingfenOptions = document.getElementsByClassName("chuangmianpingfenOption");
			for(var chuangmianpingfenCount = 0; chuangmianpingfenCount < chuangmianpingfenOptions.length;chuangmianpingfenCount++){
				if(chuangmianpingfenOptions[chuangmianpingfenCount].getAttribute('value') == ruleForm.chuangmianpingfen){
					chuangmianpingfenOptions[chuangmianpingfenCount].setAttribute('selected','selected');
				}
			}
			var qiangmianpingfenOptions = document.getElementsByClassName("qiangmianpingfenOption");
			for(var qiangmianpingfenCount = 0; qiangmianpingfenCount < qiangmianpingfenOptions.length;qiangmianpingfenCount++){
				if(qiangmianpingfenOptions[qiangmianpingfenCount].getAttribute('value') == ruleForm.qiangmianpingfen){
					qiangmianpingfenOptions[qiangmianpingfenCount].setAttribute('selected','selected');
				}
			}
			var neiwupingfenOptions = document.getElementsByClassName("neiwupingfenOption");
			for(var neiwupingfenCount = 0; neiwupingfenCount < neiwupingfenOptions.length;neiwupingfenCount++){
				if(neiwupingfenOptions[neiwupingfenCount].getAttribute('value') == ruleForm.neiwupingfen){
					neiwupingfenOptions[neiwupingfenCount].setAttribute('selected','selected');
				}
			}
			var chuanghupingfenOptions = document.getElementsByClassName("chuanghupingfenOption");
			for(var chuanghupingfenCount = 0; chuanghupingfenCount < chuanghupingfenOptions.length;chuanghupingfenCount++){
				if(chuanghupingfenOptions[chuanghupingfenCount].getAttribute('value') == ruleForm.chuanghupingfen){
					chuanghupingfenOptions[chuanghupingfenCount].setAttribute('selected','selected');
				}
			}
			var zhuodengpingfenOptions = document.getElementsByClassName("zhuodengpingfenOption");
			for(var zhuodengpingfenCount = 0; zhuodengpingfenCount < zhuodengpingfenOptions.length;zhuodengpingfenCount++){
				if(zhuodengpingfenOptions[zhuodengpingfenCount].getAttribute('value') == ruleForm.zhuodengpingfen){
					zhuodengpingfenOptions[zhuodengpingfenCount].setAttribute('selected','selected');
				}
			}
			$("#zhengtixiaoguo").val(ruleForm.zhengtixiaoguo);	
			var pingxuanjieguoOptions = document.getElementsByClassName("pingxuanjieguoOption");
			for(var pingxuanjieguoCount = 0; pingxuanjieguoCount < pingxuanjieguoOptions.length;pingxuanjieguoCount++){
				if(pingxuanjieguoOptions[pingxuanjieguoCount].getAttribute('value') == ruleForm.pingxuanjieguo){
					pingxuanjieguoOptions[pingxuanjieguoCount].setAttribute('selected','selected');
				}
			}
			$("#jianchariqi-input").val(ruleForm.jianchariqi);
		}		
		//图片显示
		function showImg(){
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.qinshihao != null && res.data.qinshihao != ''){

						$("#qinshihao").val(res.data.qinshihao);
						$("#qinshihao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.wupinbaifang != null && res.data.wupinbaifang != ''){

						var wupinbaifangOptions = document.getElementsByClassName("wupinbaifangOption");
						for(var wupinbaifangCount = 0; wupinbaifangCount < wupinbaifangOptions.length;wupinbaifangCount++){
							if(wupinbaifangOptions[wupinbaifangCount].getAttribute('value') == res.data.wupinbaifang){
								wupinbaifangOptions[wupinbaifangCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.dimianweisheng != null && res.data.dimianweisheng != ''){

						var dimianweishengOptions = document.getElementsByClassName("dimianweishengOption");
						for(var dimianweishengCount = 0; dimianweishengCount < dimianweishengOptions.length;dimianweishengCount++){
							if(dimianweishengOptions[dimianweishengCount].getAttribute('value') == res.data.dimianweisheng){
								dimianweishengOptions[dimianweishengCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.chuangmianpingfen != null && res.data.chuangmianpingfen != ''){

						var chuangmianpingfenOptions = document.getElementsByClassName("chuangmianpingfenOption");
						for(var chuangmianpingfenCount = 0; chuangmianpingfenCount < chuangmianpingfenOptions.length;chuangmianpingfenCount++){
							if(chuangmianpingfenOptions[chuangmianpingfenCount].getAttribute('value') == res.data.chuangmianpingfen){
								chuangmianpingfenOptions[chuangmianpingfenCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.qiangmianpingfen != null && res.data.qiangmianpingfen != ''){

						var qiangmianpingfenOptions = document.getElementsByClassName("qiangmianpingfenOption");
						for(var qiangmianpingfenCount = 0; qiangmianpingfenCount < qiangmianpingfenOptions.length;qiangmianpingfenCount++){
							if(qiangmianpingfenOptions[qiangmianpingfenCount].getAttribute('value') == res.data.qiangmianpingfen){
								qiangmianpingfenOptions[qiangmianpingfenCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.neiwupingfen != null && res.data.neiwupingfen != ''){

						var neiwupingfenOptions = document.getElementsByClassName("neiwupingfenOption");
						for(var neiwupingfenCount = 0; neiwupingfenCount < neiwupingfenOptions.length;neiwupingfenCount++){
							if(neiwupingfenOptions[neiwupingfenCount].getAttribute('value') == res.data.neiwupingfen){
								neiwupingfenOptions[neiwupingfenCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.chuanghupingfen != null && res.data.chuanghupingfen != ''){

						var chuanghupingfenOptions = document.getElementsByClassName("chuanghupingfenOption");
						for(var chuanghupingfenCount = 0; chuanghupingfenCount < chuanghupingfenOptions.length;chuanghupingfenCount++){
							if(chuanghupingfenOptions[chuanghupingfenCount].getAttribute('value') == res.data.chuanghupingfen){
								chuanghupingfenOptions[chuanghupingfenCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.zhuodengpingfen != null && res.data.zhuodengpingfen != ''){

						var zhuodengpingfenOptions = document.getElementsByClassName("zhuodengpingfenOption");
						for(var zhuodengpingfenCount = 0; zhuodengpingfenCount < zhuodengpingfenOptions.length;zhuodengpingfenCount++){
							if(zhuodengpingfenOptions[zhuodengpingfenCount].getAttribute('value') == res.data.zhuodengpingfen){
								zhuodengpingfenOptions[zhuodengpingfenCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.zhengtixiaoguo != null && res.data.zhengtixiaoguo != ''){

						$("#zhengtixiaoguo").val(res.data.zhengtixiaoguo);
						$("#zhengtixiaoguo").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.pingxuanjieguo != null && res.data.pingxuanjieguo != ''){

						var pingxuanjieguoOptions = document.getElementsByClassName("pingxuanjieguoOption");
						for(var pingxuanjieguoCount = 0; pingxuanjieguoCount < pingxuanjieguoOptions.length;pingxuanjieguoCount++){
							if(pingxuanjieguoOptions[pingxuanjieguoCount].getAttribute('value') == res.data.pingxuanjieguo){
								pingxuanjieguoOptions[pingxuanjieguoCount].setAttribute('selected','selected');
							}
						}
					}
					if(res.data != null && res.data != '' && res.data.jianchariqi != null && res.data.jianchariqi != ''){

						$("#jianchariqi-input").val(res.data.jianchariqi);
						$('#jianchariqiFileName').val(res.data.jianchariqi)
					}
				}
			});  
            }
		window.sessionStorage.removeItem('crossTableName');
		window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			$('#exitBtn').on('click', function(e) {
			    cancel();
			});
			readonly();
		});		

		function readonly(){
            if(window.sessionStorage.getItem('role')!="管理员") {
				$('#money').attr('readonly','readonly');
            }
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(parseInt(largerVal)<=parseInt(smallerVal)){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
