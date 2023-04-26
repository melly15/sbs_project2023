package com.lsh.exam.demo.utill;

public class Ut {
	
	public static boolean empty(Object obj) {
		
		//null 체크
		if ( obj == null ) {
			return true;
		}
		
		//string 객체인지 아닌지 체크
		if (obj instanceof String == false) {
			return true;
		}
		
		String str = (String) obj;
		
		//빈공간인지 아닌지 체크
		return str.trim().length()==0;
	}

	//몇개의 object가 들어올지몰라서 밑처럼 만들어주면 알아서 배열로 들어옴
	public static String f(String format, Object... args) {
		
		return String.format(format, args);
	}

	public static String jsHistoryBack(String msg) {
		
		return Ut.f("""
				<script>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
					const msg = '%s'.trim();
					if (msg.length > 0) {
						alert(msg);
					}
					history.back();
<<<<<<< HEAD
=======
=======
				const msg = '%s'.trim();
				if (msg.length > 0) {
					alert(msg);
				}
				history.back();
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
				</script>
				""", msg);
	}
	
	public static String jsReplace(String msg, String uri) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
		if (msg == null ) {
			msg = "";
		}
		
		if (uri == null) {
			uri="";
		}
		return Ut.f("""
				<script>
					const msg = '%s'.trim();
					if (msg.length > 0) {
						alert(msg);
					}
					location.replace('%s');
<<<<<<< HEAD
=======
=======
		if(msg == null) {
			msg="";
		}
		if(msg == null) {
			uri="";
		}
		
		return Ut.f("""
				<script>
				const msg = '%s'.trim();
				if (msg.length > 0) {
					alert(msg);
				}
				location.replace('%s')
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
				</script>
				""", msg, uri);
	}

	

}
