<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="include/header.jsp" %>
<!-- In ra danh sách các cuốn sách trong giỏ hàng -->
<%
	ArrayList<GioHangbean> dsgh = (ArrayList<GioHangbean>)request.getAttribute("dsgh");
	GioHangbo ds = (GioHangbo)request.getAttribute("ds");
%>
<h4><b>Giỏ hàng của bạn</b></h4>
<table class="table table-hover">
	<% if (dsgh.size()>0) {
		for(GioHangbean gh: dsgh) {
	%>
		<tr>
			<td>
				<span><b><%=gh.getTenSach() %></b></span><br>
				<span>Giá: <%=gh.getGia() %> VNĐ</span>
				<span style="display:inline;">
					<form action="xulygiohang?action=suasoluong" method="post">
						Số lượng: <input type="number" min="1"  name="soluong" value="<%=gh.getSlmua()%>" style="width:50px;">
						<input type="hidden" name="masach" value="<%=gh.getMaSach()%>">
						<input type="submit" value="Cập nhật">
					</form>
				</span>
				<span style="display:inline;">
					<form action="xulygiohang?action=tralai" method="post">
						<input type="hidden" name="masach" value="<%=gh.getMaSach()%>">
						<input type="submit" value="Trả lại">
					</form>
				</span>
			</td>
		</tr>
	<%}%>
		<tr>
			<td><h4><b>Tổng tiền: <%=ds.TongTien() %> VNĐ</b></h4></td>
		</tr>
	<%} else {%>
	<tr>Danh sách trống. Mời bạn về <a href="HtSach">trang chủ</a> để mua hàng</tr>
	<%} %>
</table>
<div>
	<a href="xulygiohang?action=xoaall"><button class="btn btn-danger">Xóa tất cả</button></a>
	<a href="HtSach"><button class="btn">Tiếp tục mua hàng</button></a>
	<a href="thanhtoan"><button class="btn btn-success">Thanh toán</button></a>
</div>
</body>
</html>