<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.spring.board.BoardDTO" %>

<!-- 세션에 저장된 boardList를 끄집어낸다. -->
<%
	//session은 내장 객체이므로 별도로 import없이 사용 가능
	
	List<BoardDTO> boardList = (List) session.getAttribute("boardList");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>게시판 목록 출력 페이지</h1>
	<hr>
	
	<h3> 환영합니다. <a href = "logout.do">Log-Out</a></h3>
	
	<!-- 검색 기능 추가 -->
	<form action = "getBoardList.jsp" method="post">
		<table border="1" cellspacing="0" cellpadding="0" width="700">
			<tr>
				<td> <select name="searchCondition">
					<option value = "TITLE">제목</option>
					<option value = "CONTENT">내용</option>				
					</select>
					<input type="text" name="searchKeword" />
					<input type="submit" value="검색">
				</td>
			</tr>
		</table>
		
		<!-- 서버에서 담은 List에 저장된 DTO를 끄집어내서 출력 -->
		<table border="1" cellspacing="0" cellpadding="0" width="700">
			<tr>
				<th bgcolor="orange" width = "100">번호</th>
				<th bgcolor="orange" width = "200">제목</th>
				<th bgcolor="orange" width = "150">작성자</th>
				<th bgcolor="orange" width = "150">등록일</th>
				<th bgcolor="orange" width = "100">조회수</th>
			</tr>
		
			<!-- tr을 for문으로 루프를 돌리면서 List의 DTO값을 끄집어내서 출력 -->
			
			<%
				for (BoardDTO dto : boardList) {
			%>
			
			<tr>
				<td align = "center"><%= dto.getSeq() %></td>
				<td>
					<a href ="getBoard.do?seq=<%= dto.getSeq()%>">
					<%= dto.getTitle() %>
					</a>
				</td>
				<td align = "center"><%= dto.getWriter() %></td>
				<td align = "center"><%= dto.getRegDate() %></td>
				<td align = "center"><%= dto.getCnt() %></td>
			</tr>
		
			<%
				}			
			%>
		</table>
		
		<p />
		<a href = "insertBoard.jsp"> 새 글 등록 </a>
		
	</form>

</center>
</body>
</html>