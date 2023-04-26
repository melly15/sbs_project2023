<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<<<<<< HEAD
=======
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
<c:set var="pageTitle" value="게시물 수정"/>
<%@include file="../common/head.jspf" %>

<section class="mt-5">
  <div class="container mx-auto px-3">
	<form class="table-box-type-1" method="POST" action="../article/doModify">
	  <input type="hidden" name="id" value="${article.id}"/>
<<<<<<< HEAD
	
=======

>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
      <table>
      <colgroup>
        <col width="200"/>
      </colgroup>
        <tbody>
          <tr>
            <th>번호</th>
            <td>${article.id}</td>
          </tr>
          <tr>
            <th>작성날짜</th>
            <td>${article.getRegDateForPrint()}</td>
          </tr>
          <tr>
            <th>수정날짜</th>
            <td>${article.getUpdateDateForPrint()}</td>
          </tr>
          <tr>
            <th>작성자</th>
            <td>${article.extra__writerName}</td>
          </tr>
          <tr>
            <th>제목</th>
            <td>
              <input type="text" class="w-96 input input-bordered w-full max-w-xs" name="title" placeholder="제목" value="${article.title}"/>
            </td>
          </tr>
          <tr>
            <th>내용</th>
            <td>
<<<<<<< HEAD
              <textarea type="text" class="w-full textarea textarea-bordered" name="body" placeholder="내용" >${article.body}</textarea>
=======
              <textarea type="text" class="w-full textarea textarea-bordered" name="body" placeholder="내용" value="${article.body}"></textarea>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
            </td>
          </tr>
          <tr>
            <th>수정</th>
            <td>
<<<<<<< HEAD
              <input type="submit" class="btn btn-primary" value="수정"/>
              <button type="button" class="btn btn-outline btn-primary" onclick="history.back();">뒤로가기</button>
=======
              <input type="submit" class = "btn btn-primary" value="수정"/>
              <button type="button" class = "btn btn-outline btn-primary" onclick="history.back();">뒤로가기</button>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
            </td>
          </tr>
        </tbody>
      </table>   
<<<<<<< HEAD
	
	  <div class="btns">
		<button class="btn btn-link" type="button" onclick="history.back();">뒤로가기</button>
		<a class="btn btn-link" href="../article/modify?id=${article.id}">게시물 수정</a>
		
		<c:if test="${article.extra__actorCanDelete}">
			<a class="btn btn-link" onclick="if( confirm('정말 삭제하시겠습니까?') == false )return false;" href="../article/doDelete?id=${article.id}">게시물 삭제</a>
=======

	  <div class="btns">
		<button class="btn btn-link" type="button" onclick="history.back();">뒤로가기</button>
		<a class="btn btn-link" href="../article/modify?id=${article.id}">게시물 수정</a>

		<c:if test="${article.extra__actorCanDelete}">
			<a class="btn-text-link" onclick="if( confirm('정말 삭제하시겠습니까?') == false )return false;" href="../article/doDelete?id=${article.id}">게시물 삭제</a>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
		</c:if>	
	  </div>
	</form>
  </div>
</section>
<<<<<<< HEAD
=======


>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
<%@include file="../common/foot.jspf" %>