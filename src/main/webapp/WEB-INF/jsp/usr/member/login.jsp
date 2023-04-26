<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" value="로그인"/>
<%@include file="../common/head.jspf" %>

<section class="mt-5">
  <div class="container mx-auto">
	  <form class="table-box-type-1" method="POST" action="../member/doLogin">
		  <table>
<<<<<<< HEAD
			  <colgroup>
			  	<col width="200"/>
			  </colgroup>
=======
		  <colgroup>
		  <col width="200"/>
		  
		  </colgroup>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
			  <tbody>
			  	<tr>
			  		<th>로그인아이디</th>
			  		<td>
<<<<<<< HEAD
			  			<input type="text" class="w-96 input input-bordered w-full max-w-xs" name="loginId" placeholder="로그인아이디"/>
=======
			  			<input type="text" class="w-96 input input-bordered w-full max-w-xs"  name="loginId" placeholder="로그인아이디"/>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
			  		</td>
			  	</tr>
			  	<tr>
			  		<th>로그인비밀번호</th>
			  		<td>
			  			<input type="text" class="w-96 input input-bordered w-full max-w-xs" name="loginPw" placeholder="로그인비밀번호"/>
			  		</td>
			  	</tr>
			  	<tr>
			  		<th>로그인</th>
			  		<td>
<<<<<<< HEAD
			  			<input type="submit" class="btn btn-primary" value="로그인"/>
			  			<button type="button" class="btn btn-outline btn-primary" onclick="history.back();">뒤로가기</button>
=======
			  			<input type="submit" value="로그인" class="btn btn-primary"/>
			  			<button type="button" onclick="history.back();" class="btn btn-primary btn-outline">뒤로가기</button>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
			  		</td>
			  	</tr>
			  </tbody>
		  </table>
	  </form>
  </div>
</section>

<%@include file="../common/foot.jspf" %>