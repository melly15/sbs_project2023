<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
	var historyBack = '${historyBack}'  == 'true';
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
	var historyBack = 'true' == 'true';
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	var msg = '${msg}'.trim();
	if (msg) {
		alert(msg);
	}
	
	if (historyBack) {
		history.back();
	}
	
	var replaceUri = '${replaceUri}'.trim();
	if (replaceUri) {
		location.replaceUri(replaceUri);
	}
</script>