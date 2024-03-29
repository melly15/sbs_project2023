<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="pageTitle" value="게시물 내용"/>
<%@include file="../common/head.jspf" %>

<script>
const params = {}
params.id = parseInt('${param.id}');
</script>

<script>
function ArticleDetail__increseHitCount() {
	const localStorageKey = 'article__' + params.id + '__viewDone';
	
	if (localStorage.getItem(localStorageKey)) {
		return;
	}
	
	localStorage.setItem(localStorageKey, true);
	
	$.get(
		'../article/doIncreaseHitCountRd', {
			id : params.id,
			ajaxMode : 'Y'
		}, function(data) {
			$('.article-detail__hit-count').empty().html(data.data1);
		}, 'json');
}
$(function() {
	// 실전코드
	// ArticleDetail__increseHitCount();
	
	// 임시코드
	setTimeout(ArticleDetail__increseHitCount, 300);
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<<<<<<< HEAD
<c:set var="pageTitle" value="게시물 상세" />
<%@include file="../common/head.jspf"%>

<script>
   const params = {}
   params.id = parseInt('${param.id}');
</script>

<script>
   function ArticleDetail__increaseHitCount(){
	   
	   const localStorageKey = 'article__' + params.id + '__viewDone';
	   
	   if (localStorage.getItem(localStorageKey)){
		   return;
	   }
	   
	   localStorage.setItem(localStorageKey, true);
	   
      $.get(
         '../article/doIncreaseHitCountRd', {
            id : params.id,
            ajaxMode : 'Y'
         }, function(data) {
            $('.article-detail__hit-count').empty().html(data.data1);
         },'json');
   }
   
$(function() {
   //ArticleDetail__increaseHitCount();
   
   //임시코드(3초후 적용하겠다는뜻)
   setTimeout(ArticleDetail__increaseHitCount, 300);
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
})
</script>

<section class="mt-5">
<<<<<<< HEAD
	<div class="container mx-auto px-3">
=======
      <div class="container mx-auto px-3">
            <div class="table-box-type-1">
                  <table>
                        <colgroup>
                              <col width="200" />
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
                                 <th>조회수</th>
                                 <td>
                                    <span class="badge badge-primary article-detail__hit-count">${article.hitCount }</span>
                                 </td>
                              </tr>
                              <tr>
                                 <th>제목</th>
                                 <td>${article.title}</td>
                              </tr>
                              <tr>
                                 <th>내용</th>
                                 <td>${article.body}</td>
                              </tr>
                        </tbody>
                  </table>
            </div>

            <div class="btns">
                  <button class="btn btn-link" type="button" onclick="history.back();">뒤로가기</button>
                  <c:if test="${article.extra__actorCanModify }">
                        <a class="btn btn-link" href="../article/modify?id=${article.id }">게시물 수정</a>
                  </c:if>
                  <c:if test="${article.extra__actorCanDelete}">
                        <a class="btn btn-link" onclick="if( confirm('정말 삭제하시겠습니까?') == false )return false;"
                              href="../article/doDelete?id=${article.id }">게시물 삭제</a>
                  </c:if>
            </div>
      </div>
</section>

=======
<c:set var="pageTitle" value="게시물 내용" />
<%@include file="../common/head.jspf"%>


<section class="mt-5">
		<div class="container mx-auto px-3">
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
    <div class="table-box-type-1">
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
<<<<<<< HEAD
            <th>조회수</th>
            <td>
            	<span class="text-blue-700 article-detail__hit-count">${article.hitCount}</span>
			</td>
          </tr>
          <tr>
            <th>추천수</th>
            <td>
            	<span class="text-blue-700">${article.extra__goodReactionPoint}</span>
			</td>
          </tr>
          <tr>
=======
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
            <th>제목</th>
            <td>
              ${article.title}
            </td>
          </tr>
          <tr>
            <th>내용</th>
            <td>
              ${article.body}
            </td>
          </tr>
        </tbody>
      </table>
    </div>
<<<<<<< HEAD
	
	<div class="btns">
		<button class="btn btn-link" type="button" onclick="history.back();">뒤로가기</button>
		<c:if test="${article.extra__actorCanModify}">
			<a class="btn btn-link" href="../article/modify?id=${article.id}">게시물 수정</a>
		</c:if>
		
		<c:if test="${article.extra__actorCanDelete}">
			<a class="btn btn-link" onclick="if( confirm('정말 삭제하시겠습니까?') == false )return false;" href="../article/doDelete?id=${article.id}">게시물 삭제</a>
		</c:if>
	</div>
  </div>
</section>


<!--
<iframe src="http://localhost:8011/usr/article/doIncreaseHitCountRd?id=1" frameborder="0"></iframe>
<script>
location.href= "http://localhost:8011/usr/article/doIncreaseHitCountRd?id=1";
</script>
 -->
 <%@include file="../common/foot.jspf" %>
=======
	<div class="btns">
		<button class="btn btn-link" type="button" onclick="history.back();">뒤로가기</button>
		<c:if test="${article.extra__actorCanModify}">
			<a class="btn-text-link" href="../article/modify?id=${article.id }">게시물 수정</a>
      	</c:if>
      <c:if test="${article.extra__actorCanDelete}">
      	<a class="btn btn-link" onclick="if(confirm('정말 삭제하시겠습니까')==false)return false;" href="../article/doDelete?id=${article.id }">게시물 삭제</a>
      </c:if>
   </div>
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20

<%@include file="../common/foot.jspf"%>
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
