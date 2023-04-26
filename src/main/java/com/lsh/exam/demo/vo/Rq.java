package com.lsh.exam.demo.vo;

import java.io.IOException;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.lsh.exam.demo.service.MemberService;
import com.lsh.exam.demo.utill.Ut;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;
<<<<<<< HEAD

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//자동으로 의존성 주입해줌
public class Rq {
	
=======
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Rq {
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	@Getter
	private boolean isLogined;
	@Getter
	private int loginedMemberId;
	@Getter
	private Member loginedMember;
	
	private HttpServletRequest req;
	private HttpServletResponse resp;
	private HttpSession session;
	
	public Rq(HttpServletRequest req, HttpServletResponse resp, MemberService memberService) {
		this.req = req;
		this.resp = resp;
		
		this.session = req.getSession();
		
		boolean isLogined = false;
<<<<<<< HEAD
		
		int loginedMemberId = 0;
		
		if (session.getAttribute("loginedMemberId") != null) {
			
=======
		int loginedMemberId = 0;
		
		if ( session.getAttribute("loginedMemberId") != null) {
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
			isLogined = true;
			loginedMemberId = (int) session.getAttribute("loginedMemberId");
			loginedMember = memberService.getMemberById(loginedMemberId);
		}
		
		this.isLogined = isLogined;
		this.loginedMemberId = loginedMemberId;
		this.loginedMember = loginedMember;
		
		this.req.setAttribute("rq", this);
	}
	
	public void printHistoryBackJs(String msg) {
		resp.setContentType("text/html; charset=UTF-8");
		print(Ut.jsHistoryBack(msg));
	}
	
	public void print(String str) {
		try {
			resp.getWriter().append(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void println(String str) {
<<<<<<< HEAD
		
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
		print(str + "\n");
	}

	public void login(Member member) {
		session.setAttribute("loginedMemberId", member.getId());
<<<<<<< HEAD
		
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	}

	public void logout() {
		session.removeAttribute("loginedMemberId");
<<<<<<< HEAD
		
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	}
	
	public String historyBackJsOnview(String msg) {
		req.setAttribute("msg", msg);
		req.setAttribute("historyBack", true);
		return "common/js";
	}

	public String jsHistoryBack(String msg) {
<<<<<<< HEAD
		
=======
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
		return Ut.jsHistoryBack(msg);
	}
	
	public String jsReplace(String msg, String uri) {
<<<<<<< HEAD
		
		return Ut.jsReplace(msg,uri);
	}

	//Rq 객체가 자연스럽게 생성되도록 유도하는 역할
	//지우면 안됨,편의를 위해 BeforeActionInterceptor에서 꼭 호출 해줘야함.
	public void initOnBeforeActionInterceptor() {}
	
	
}
=======
		return Ut.jsReplace(msg, uri);
	}

	// 이 메서드는 Rq객체가 자연스럽게 생성되도록 유도하는 역할을 한다.
	// 지우면 안되고,
	// 편의를 위해 BeforeActionInterceptor에서 꼭 호출해줘야 한다.
	public void initOnBeforeActionInterceptor() {
	}
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
