package com.lsh.exam.demo.vo;

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	private int id;
	private String regDate;
	private String updateDate;
	private int memberId;
	private String title;
	private String body;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	private int hitCount;
	
	private int extra__sumReactionPoint;
	private int extra__goodReactionPoint;
	private int extra__badReactionPoint;
<<<<<<< HEAD
=======
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	
	private String extra__writerName;
	private boolean extra__actorCanDelete;
	private boolean extra__actorCanModify;
	
	public String getRegDateForPrint() {
		return regDate.substring(2, 16);
	}
<<<<<<< HEAD
	
	public String getUpdateDateForPrint() {
		return updateDate.substring(2, 16);
	}
	
	public String forPrintType1RegDate() {
		return regDate.substring(2, 16).replace(" ", "<br>");
	}
	
	public String forPrintType1UpdateDate() {
		return updateDate.substring(2, 16).replace(" ", "<br>");
	}
}
=======
<<<<<<< HEAD
	
	public String getUpdateDateForPrint() {
		return regDate.substring(2, 16);
	}

}
=======
	public String getUpdateDateForPrint() {
		return updateDate.substring(2, 16);
	}

}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
