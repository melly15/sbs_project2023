<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<<<<<< HEAD
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
<c:set var="pageTitle" value="게시물 작성"/>
<%@include file="../common/head.jspf" %>

<section class="mt-5">
<<<<<<< HEAD
	<div class="container mx-auto px-3">
	    <form method="POST" action="../article/doWrite">
	    	 <input type="hidden" name="id" value="${article.id }"/>
			    <div class="table-box-type-1">
			      <table>
			      <colgroup>
			        <col width="200"/>
			      </colgroup>
			        <tbody>
			           <tr>
			            	<th>게시판</th>
			            	<td>
			           		 <select name="boardId" class="select select-boardered max-w-x">
				            	<option selected disabled>게시판을 선택해주세요</option>
				            	<option value="1">공지</option>
				            	<option value="2">자유</option>
			            	</select>
							</td>
			          </tr>
			          <tr>
			            <th>작성자</th>
			            <td>${rq.loginedMember.nickname}</td>
			          </tr>
			          <tr>
			            <th>제목</th>
			            <td>
			              <input required="required" type="text" class="w-96 input input-bordered w-full max-w-xs" name="title" placeholder="제목" value="${article.title }"/>
			            </td>
			          </tr>
			          <tr>
			            <th>내용</th>
			            <td>
			              <textarea required="required" class="w-full textarea textarea-bordered" name="body" placeholder="내용" >${article.body }</textarea>
			            </td>
			          </tr>
			           <tr>
			            <th>수정</th>
			            <td>
			              <input class="btn btn-primary" type="submit" value="작성"/>
			              <button class="btn btn-outline btn-primary" type="button" onclick="history.back();">뒤로가기</button>
			            </td>
			          </tr>
			        </tbody>
			      </table>
			    </div>
			
	    </form>
    </div>
</section>

<%@include file="../common/foot.jspf" %>
=======
  <div class="container mx-auto px-3">
	<form class="table-box-type-1" method="POST" action="../article/doWrite">
	  <input type="hidden" name="id" value="${article.id}"/>
	
      <table>
      <colgroup>
        <col width="200"/>
      </colgroup>
        <tbody>
        <tr>
            <th>게시판</th>
            <td>
            <select name="boardId" class="select select-bordered max-w-x">
            	<option selected disabled>게시판을 선택해주세요.</option>
            	<option value="1">공지</option>
            	<option value="2">자유</option>
            </select>
            <!-- 
            	<label>
            		공지
            		<input type="radio" name="boardId" value="1"/>
            	</label>
            	<label>
            		자유
            		<input type="radio" name="boardId" value="2"/>
            	</label>
            -->
            </td>
          </tr>
          <tr>
          <tr>
            <th>작성자</th>
            <td>${rq.loginedMember.nickname}</td>
          </tr>
          <tr>
            <th>제목</th>
            <td>
              <input required="required" type="text" class="w-96 input input-bordered w-full max-w-xs" name="title" placeholder="제목" value="${article.title}"/>
            </td>
          </tr>
          <tr>
            <th>내용</th>
            <td>
              <textarea required="required" class="w-full textarea textarea-bordered" name="body" placeholder="내용" >${article.body}</textarea>
            </td>
          </tr>
          <tr>
            <th>수정</th>
            <td>
              <input type="submit" class="btn btn-primary" value="작성"/>
              <button type="button" class="btn btn-outline btn-primary" onclick="history.back();">뒤로가기</button>
            </td>
          </tr>
        </tbody>
      </table>
	</form>
  </div>
</section>
<%@include file="../common/foot.jspf" %>
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
