<%@ page import="bean.Sachbean" %>
<%@ page import="bean.LoaiSachbean" %>
<%@ page import="bo.Sachbo" %>
<%@ page import="bo.LoaiSachbo" %>
<%@ page import="bo.KhachHangbo" %>
<%@ page import="bean.KhachHangbean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="bo.GioHangbo" %>
<%@ page import="bean.GioHangbean" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chủ</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="HtSach">Trang chu</a></li>
     
      <li><a href="giohang">Giỏ hàng</a></li>
      <li><a href="thanhtoan">Thanh toán</a></li>
      <li><a href="lichsu">Lịch sử mua hàng</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
		  <%
		  	if (session.getAttribute("nguoidung") != null ) { 
		  		KhachHangbean sskh = (KhachHangbean)session.getAttribute("nguoidung");
		  	%>	
		  		<li>
		  			<a>Xin chào: <%=sskh.getHoTen() %></a>
		  		</li>
		  		<li>
		  			<a href="dangnhap?logout=true"><span class="glyphicon glyphicon-log-out" onclick="return dangxuat();"></span> Đăng xuất</a>
		  		</li>
		  	<% }
		  	else { %> 
		  		<li>
		          <a href="#" ><span class="glyphicon glyphicon-user"></span> Đăng ký</a>
		      
		      </li>
				<li>
					<a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a>
				</li>
		  	<%if (request.getAttribute("thongbaodangnhap")!=null) {
    			out.print("<script>alert('" + request.getAttribute("thongbaodangnhap") + "')</script>");
    		} 
		  	}
		  	%>
    </ul>
  </div>
</nav>
<!-- model Đăng nhập -->
<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
 <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Thông tin đăng nhập</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <!-- Modal body -->
        <div class="modal-body">
          <form method="post" action="dangnhap">
             Tên đăng nhâp: <input type="text" name="txtun" class="form-control"> <br>
            Mật khẩu <input type="password" name="txtpass" class="form-control"> <br>
            <input type="submit" name="but1" value="Đăng nhập" class="btn-primary">
          </form>
        </div>
        
        
        
      </div>
    </div>
  </div>