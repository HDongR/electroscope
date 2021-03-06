<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 

<c:set var="user" value="${sessionScope.user}"/>
 
<c:if test="${null ne user}"> 	 
<c:if test="${user.userJoinType == 'MANAGER'}">

<nav class="navbar navbar-inverse visible-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="/">ES</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="${condition eq 'manager_main' ? 'active' : ''}"><a href="/manager/">통계</a></li>
		<li class="dropdown ${(condition == 'goods_manage_page' || condition == 'add_goods_page') ? 'active' : ''}"><a class="dropdown-toggle" data-toggle="dropdown" href="#">상품관리<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li class="${condition eq 'goods_manage_page' ? 'active' : ''}"><a href="/manager/goods/goods_manage_page">상품현황</a></li>
				<li class="${condition eq 'add_goods_page' ? 'active' : ''}"><a href="/manager/goods/add_goods_page">상품등록</a></li>				 
			</ul>
		</li> 
		<li class="${condition eq 'user_manage_page' ? 'active' : ''}"><a href="/manager/user/user_manage_page">유저관리</a></li>
	 
      </ul>
    </div>
  </div>
</nav>


</c:if>
</c:if>