<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<<<<<< HEAD
<c:set var="pageTitle" value=" ${board.name} 게시물 리스트"/>
=======
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="pageTitle" value="${board.name} 게시물 리스트"/>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
<%@include file="../common/head.jspf" %>

<section class="mt-5">
  <div class="container mx-auto px-3">
<<<<<<< HEAD
  
  <div class="flex">
  	<div>
  		게시물 개수 : <span class="text-blue-700">${articlesCount}</span>개
  	</div>
  	<div class="flex-grow"></div>
  	<form class="flex">
  		<input type="hidden" name="boardId" value="${param.boardId}" />
  		<select name="searchKeywordTypeCode" data-value="${param.searchKeywordTypeCode}" id="" class="select select-bordered">
			<option disabled="disabled">검색타입</option>
			<option value="title">제목</option>
			<option value="body">내용</option>
			<option value="title,body">제목,내용</option>  		
  		</select>
  		<input name="searchKeyword" type="text" class="ml-2 w-72 input input-bordered" placeholder="검색어" maxlength="20" value="${param.searchKeyword}"/>
  		<button type="submit" class="ml-2 btn btn-primary">검색</button>
  	</form>
  </div>
  
  
    <div class="mt-3">
      <table class="table table-fixed w-full">
=======
  <div>게시물 개수 : ${articlesCount}</div>
    <div class="table-box-type-1">
      <table>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
        <colgroup>	
          <col width="50"/>
          <col width="200"/>
          <col width="200"/>
          <col width="150"/>
          <col />
        </colgroup>
        <thead>
          <tr>
            <th>번호</th>
            <th>작성날짜</th>
            <th>수정날짜</th>
            <th>작성자</th>
            <th>제목</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="article" items="${articles}">
<<<<<<< HEAD
            <tr class="hover">
=======
            <tr>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
              <td>${article.id}</td>
              <td>${article.regDate.substring(2, 16)}</td>
              <td>${article.updateDate.substring(2, 16)}</td>
              <td>${article.extra__writerName}</td>
              <td>
<<<<<<< HEAD
                <a class="btn-text-link block w-full truncate" href="../article/detail?id=${article.id}">${article.title}</a>
=======
                <a href="../article/detail?id=${article.id}">${article.title}</a>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    
    <div class="page-menu mt-5 flex justify-center">
	    <div class="btn-group">
	    <c:set var="pageMenuArmLen" value="4"/>
	    <c:set var="startPage" value="${page - pageMenuArmLen >= 1 ? page - pageMenuArmLen : 1}"/>
	    <c:set var="endPage" value="${page + pageMenuArmLen <= pagesCount ? page + pageMenuArmLen : pagesCount}"/>
<<<<<<< HEAD
	    <c:set var="pageBaseUri" value="?boardId=${boardId}"/>
	    <c:set var="pageBaseUri" value="${pageBaseUri}&searchKeyword=${param.searchKeyword}"/>
	    <c:set var="pageBaseUri" value="${pageBaseUri}&searchKeywordTypeCode=${param.searchKeywordTypeCode}"/>
	    
	    <c:if test="${startPage > 1}">
	    	<a class="btn btn-sm" href="?${pageBaseUri}&page=1">1</a>
	    	<c:if test="${startPage > 2}">
	    		<a class="btn btn-sm btn-disabled" >...</a>
	    	</c:if>
	    </c:if>
		
		<c:forEach begin="${startPage}" end="${endPage}" var="i">
		  	<a class="btn btn-sm ${page == i ? 'btn-active' : ''}" href="?${pageBaseUri}&page=${i}">${i}</a>
		</c:forEach>
		
		<c:if test="${endPage < pagesCount}">
			<c:if test="${endPage < pagesCount - 1}">
				<a class="btn btn-sm btn-disabled" >...</a>
			</c:if>
	    	<a class="btn btn-sm" href="?${pageBaseUri}&page=${pagesCount}">${pagesCount}</a>
=======
	    
	    <c:if test="${startPage > 1}">
	    	<a class="btn btn-sm" href="?page=1&boardId=${boardId}">1</a>
	    	<a class="btn btn-sm btn-disabled" >...</a>
	    </c:if>
		
		<c:forEach begin="${startPage}" end="${endPage}" var="i">
		  	<a class="btn btn-sm ${page == i ? 'btn-active' : ''}" href="?page=${i}&boardId=${boardId}">${i}</a>
		</c:forEach>
		
		<c:if test="${endPage < pagesCount}">
			<a class="btn btn-sm btn-disabled" >...</a>
	    	<a class="btn btn-sm" href="?page=${pagesCount}&boardId=${boardId}">${pagesCount}</a>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	    </c:if>
		</div>
	</div>
	
  </div>
</section>

<<<<<<< HEAD

=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
<%@include file="../common/foot.jspf" %>