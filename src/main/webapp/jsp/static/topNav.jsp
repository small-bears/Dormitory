<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<style>
		.top-brand {
			position: fixed;
			top: 0;
			z-index: 998;
			width: 100%;
			height: 64px;
			padding: 0;
			margin: 0;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: rgba(254, 204, 55, 1);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		.top-brand .navbar-default {
			width: 100%;
			height: 64px;
			padding: 0 15px;
			margin: 0;
			border-radius: 0;
			border-width: 0 0 10px 0;
			border-style: solid;
			border-color: rgba(254, 204, 55, 1);
			background-color: rgba(16, 91, 146, 1);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
			justify-content: space-between;
			display: flex;
			flex-wrap: wrap;
			align-items: center;
			box-sizing: border-box;
		}
		
		.top-brand .navbar-default .navbar-header a {
			width: auto;
			line-height: auto;
			padding: 0 0 0px 700px;
			margin: 0;
			color: rgba(255, 255, 255, 1);
			font-size: 20px;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: rgba(255, 202, 31, 0);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .fullscreen {
			padding: 8px;
			margin: 0 0 0 0px;
			color: rgba(0, 0, 0, 1);
			font-size: 16px;
			border-radius: 50%;
			border-width: 1px;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: rgba(254, 204, 55, 1);
			box-shadow: 0 0 6px rgba(255, 255, 255,0);
		}
		
		.top-brand .nav .ti-user {
			padding: 8px;
			margin: 0 0 0 10px;
			color: rgba(0, 0, 0, 1);
			font-size: 16px;
			border-radius: 50%;
			border-width: 1px;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: rgba(254, 204, 55, 1);
			box-shadow: 0 0 6px rgba(255, 255, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile {
			width: 150px;
			height: auto;
			padding: 0;
			margin: 0;
			border-radius: 4px;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(30, 144, 255, .8);
			left: inherit;
			right: 0;
			top: 100%;
			min-width: auto;
			margin-top: 9px;
		}
		
		.top-brand .nav .dropdown-menu.profile::before {
			left: 100%;
			margin-left: -28px;
			border-bottom-color: #333;
		}
		
		.top-brand .nav .dropdown-menu.profile h5 {
			width: 100%;
			line-height: 44px;
			padding: 0 12px;
			margin: 0;
			color: #fff;
			font-size: 16px;
			border-radius: 4px 4px 0 0;
			border-width: 0;
			border-style: solid;
			border-color: #333;
			background-color: #333;
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
			text-align: center;
		}
		
		.top-brand .nav .dropdown-menu.profile .web {
			width: 100%;
			height: auto;
			padding: 0 12px;
			margin: 0;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .web span.ti-power-off {
			padding: 2px;
			margin: 0 10px 0 0;
			color: #fff;
			font-size: 12px;
			border-radius: 50%;
			border-width: 0;
			border-style: solid;
			border-color: #333;
			background-color: #333;
			box-shadow: 0 0 6px rgba(30, 144, 255, .3);
		}
		
		.top-brand .nav .dropdown-menu.profile .web span.text {
			padding: 0;
			margin: 0;
			width: auto;
			line-height: 44px;
			color: #333;
			font-size: 16px;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #333;
			background-color: rgba(0,0,0,0);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .web:hover{
			width: 100%;
			height: auto;
			padding: 0 12px;
			margin: 0;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: rgba(254, 204, 55, 1);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .web:hover span.ti-power-off{
			padding: 2px;
			margin: 0 10px 0 0;
			color: #333;
			font-size: 12px;
			border-radius: 50%;
			border-width: 0;
			border-style: solid;
			border-color: #fff;
			background-color: #fff;
			box-shadow: 0 0 6px rgba(30, 144, 255, .3);
		}
		
		.top-brand .nav .dropdown-menu.profile .web:hover span.text{
			padding: 0;
			margin: 0;
			width: auto;
			line-height: 44px;
			color: rgba(0, 0, 0, 1);
			font-size: 16px;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #fff;
			background-color: rgba(0,0,0,0);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .exit {
			width: 100%;
			height: auto;
			padding: 0 12px;
			margin: 0;
			border-radius: 0 0 4px 4px;
			border-width: 1px 0 0 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: #fff;
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .exit span.ti-power-off {
			padding: 2px;
			margin: 0 10px 0 0;
			color: #fff;
			font-size: 12px;
			border-radius: 50%;
			border-width: 0;
			border-style: solid;
			border-color: #333;
			background-color: #333;
			box-shadow: 0 0 6px rgba(30, 144, 255, .3);
		}
		
		.top-brand .nav .dropdown-menu.profile .exit span.text {
			padding: 0;
			margin: 0;
			width: auto;
			line-height: 44px;
			color: #333;
			font-size: 16px;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #333;
			background-color: rgba(0,0,0,0);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .exit:hover{
			width: 100%;
			height: auto;
			padding: 0 12px;
			margin: 0;
			border-radius: 0 0 4px 4px;
			border-width: 1px 0 0 0;
			border-style: solid;
			border-color: rgba(0,0,0,.3);
			background-color: rgba(254, 204, 55, 1);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .nav .dropdown-menu.profile .exit:hover span.ti-power-off{
			padding: 2px;
			margin: 0 10px 0 0;
			color: #333;
			font-size: 12px;
			border-radius: 50%;
			border-width: 0;
			border-style: solid;
			border-color: #fff;
			background-color: #fff;
			box-shadow: 0 0 6px rgba(30, 144, 255, .3);
		}
		
		.top-brand .nav .dropdown-menu.profile .exit:hover span.text{
			padding: 0;
			margin: 0;
			width: auto;
			line-height: 44px;
			color: rgba(0, 0, 0, 1);
			font-size: 16px;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #fff;
			background-color: rgba(0,0,0,0);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .menu-list-title {
			display: none;
			}
			padding: 0;
			margin: 0;
			width: 180px;
			line-height: $template2.back.top.logo.lineHeight;
			color: #fff;
			font-size: 16px;
			border-radius: 0;
			border-width: 0;
			border-style: solid;
			border-color: #333;
			background-color: rgba(0, 197, 220, 1);
			box-shadow: 0 0 6px rgba(30, 144, 255, 0);
		}
		
		.top-brand .menu-list-title:before {
			content: "logo";
			display: block;
			text-align: center;
			line-height: $template2.back.top.logo.lineHeight;
		}
	</style>
				<div class="container top-brand" style="display: flex;">
					<div class="menu-list-title"></div>
					<nav class="navbar navbar-default">			
						<div class="navbar-header">
							<a href="${pageContext.request.contextPath}/index.jsp">学生宿舍管理系统 </a>
						</div>
						<ul class="nav justify-content-end">
							<li class="nav-item">
								<a class="nav-link">
									<span class="ti-fullscreen fullscreen"></span>
								</a>							
							</li>
							<li class="nav-item" style="position: relative;">
								<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
								 aria-expanded="false">
									<span class="ti-user"></span>
								</a>
								<div class="dropdown-menu lochana-box-shadow2 profile animated flipInY">
									<h5></h5>
									<a class="dropdown-item exit" href="#" onclick="logout()">
										<span class="ti-power-off"></span><span class="text">退出</span></a>
								</div>
							</li>
						</ul>
				
					</nav>
				</div>
