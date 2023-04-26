package com.lsh.exam.demo.vo;

import lombok.Getter;

public class ResultData<DT> {
<<<<<<< HEAD

	@Getter
	private String resultCode;

	@Getter
	private String msg;

	@Getter
	private DT data1;

	@Getter
	// "id" id ,"article" article
	private String data1Name;

	@Getter
	private Object data2;
	
	@Getter
	// "id" id ,"article" article
	private String data2Name;

	// 생성자 만들어서 객체 생성못하게?
	//	private ResultData() {
	//	}

	public static ResultData from(String rsultCode, String msg) {

		return from(rsultCode, msg, null, null);
	}

	public static <DT> ResultData<DT> from(String resultCode, String msg, String data1Name, DT data1) {
=======
	
	@Getter
	private String resultCode;
	
	@Getter
	private String msg;
	
	@Getter
<<<<<<< HEAD
	//"id" id ,"article" article
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	private String data1Name;
	
	@Getter
	private  DT data1;
	
<<<<<<< HEAD
	@Getter
	//"id" id ,"article" article
	private String data2Name;
	
	@Getter
	private Object data2;
		
	public static ResultData from(String rsultCode, String msg) {
		
=======
	//생성자 만들어서 객체 생성못하게?
	private ResultData() {}
	
	public static ResultData from(String rsultCode, String msg) {
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
		return from(rsultCode, msg , null, null);
	}
	
	public static  <DT> ResultData<DT> from (String resultCode, String msg, String data1Name, DT data1) {
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
		ResultData<DT> rd = new ResultData<DT>();
		rd.resultCode = resultCode;
		rd.msg = msg;
		rd.data1Name = data1Name;
		rd.data1 = data1;
<<<<<<< HEAD

		return rd;
	}

	public static <DT> ResultData<DT> newData(ResultData oldRd, String data1Name, DT data1) {

		return from(oldRd.getResultCode(), oldRd.getMsg(), data1Name, data1);
	}

	public boolean isSuccess() {
		// S-로 시작하면 성공
		return resultCode.startsWith("S-");
	}

	public boolean isFail() {
		// F-로 시작하면 실패
		return isSuccess() == false;
	}

	public void setData2(String dataName, Object data) {
		data2Name = dataName;
		data2 = data;

	}

=======
		
		return rd;
	}
	
	public static<DT> ResultData<DT> newData(ResultData oldRd, String data1Name, DT data1) {
		
		return from(oldRd.getResultCode(), oldRd.getMsg(), data1Name, data1);
	}
	
	public boolean isSuccess() {
		//S-로 시작하면 성공
		return resultCode.startsWith("S-");
	}
	
	public boolean isFail() {
		//F-로 시작하면 실패
		return isSuccess() == false;
	}

<<<<<<< HEAD
	public void setData2(String dataName, Object data) {
		data2Name = dataName;
		data2 = data;
		
	}

=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20


	


	
	

>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
}
