<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="include/header.jsp" %>
<form action="HtSach" method="post" align="right">
	<input type="text" name="txtTim" />
	<input type="submit" value="Search" name="but1" />
</form>
<%
	ArrayList<LoaiSachbean> loaisach = (ArrayList<LoaiSachbean>)request.getAttribute("dsloaisach");
%>
<table  cellspacing="0" width="1000">
<tr>
   <td valign="top" width="500">
       <table class="table table-hover"> 
       <tr>
       	<td><a href="HtSach">Tất cả sách</a></td>
       </tr>
       <%
           for(LoaiSachbean loai: loaisach){
       %>
           <tr>
              <td>
                  <a href="HtSach?ml=<%=loai.getMaloai()%>">
                     <%=loai.getTenloai()%>
                  </a>
              </td>
           </tr>
           <%} %>
       </table>
   </td>
   <td valign="top" width="600">
   <table class="table table-hover">
   <%
   ArrayList<Sachbean> ds = (ArrayList<Sachbean>)request.getAttribute("dssach");
    int n=ds.size();
   for(int i=0;i<n;i++){
    Sachbean s= ds.get(i);
    if (s.getSoluong() > 0) {
   %>
     <tr>
        <td>
           <img src="image_sach/<%=s.getAnh() %>"><br>
           <form method="post" action="xulygiohang?action=them">
             <input type="hidden" name="masach" value="<%=s.getMasach() %>">
             <input type="hidden" name="tensach" value="<%=s.getTensach()%>">
             <input type="hidden" name="tacgia" value="<%=s.getTacgia() %>">
             <input type="hidden" name="soluong" value="1">
             <input type="hidden" name="gia" value="<%=s.getGia() %>">
             <button style="border:none; background-color:white;"><img src="image_sach/buynow.jpg"></button>
           </form>
            <%=s.getTensach() %> <br>
             <%=s.getTacgia()%> <br>
              <%=s.getGia()%> <br>
        </td>
<%i++;
          if(i<n){
          	s= ds.get(i);
         	          %>
        <td>
           <img src="image_sach/<%=s.getAnh() %>"><br>
            <form method="post" action="xulygiohang?action=them">
             <input type="hidden" name="masach" value="<%=s.getMasach() %>">
             <input type="hidden" name="tensach" value="<%=s.getTensach()%>">
             <input type="hidden" name="tacgia" value="<%=s.getTacgia() %>">
             <input type="hidden" name="soluong" value="1">
             <input type="hidden" name="gia" value="<%=s.getGia() %>">
             <button style="border:none; background-color:white;"><img src="image_sach/buynow.jpg"></button>
           </form>
            <%=s.getTensach() %> <br>
             <%=s.getTacgia()%> <br>
              <%=s.getGia()%> <br>
        </td>
        <%} %>
        <%i++;
          if(i<n){
          	s= ds.get(i); %>
          <td>
             <img src="image_sach/<%=s.getAnh() %>"><br>
              <form method="post" action="xulygiohang?action=them">
	             <input type="hidden" name="masach" value="<%=s.getMasach() %>">
	             <input type="hidden" name="tensach" value="<%=s.getTensach()%>">
	             <input type="hidden" name="tacgia" value="<%=s.getTacgia() %>">
	             <input type="hidden" name="soluong" value="1">
	             <input type="hidden" name="gia" value="<%=s.getGia() %>">
	             <button style="border:none; background-color:white;"><img src="image_sach/buynow.jpg"></button>
           	</form>
              <%=s.getTensach() %> <br>
               <%=s.getTacgia()%> <br>
                <%=s.getGia()%> <br>
          </td>
<%} %>
          
   <%} }%>
 </table>
  
</body>
</html>