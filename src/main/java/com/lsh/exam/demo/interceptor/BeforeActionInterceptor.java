package com.lsh.exam.demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.lsh.exam.demo.service.MemberService;
import com.lsh.exam.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
<<<<<<< HEAD
public class BeforeActionInterceptor implements HandlerInterceptor{
	
=======
public class BeforeActionInterceptor implements HandlerInterceptor {
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	private Rq rq;
	
	public BeforeActionInterceptor(Rq rq) {
		this.rq = rq;
	}
<<<<<<< HEAD
=======
	
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	@Autowired
	private MemberService memberService;
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		rq.initOnBeforeActionInterceptor();
<<<<<<< HEAD

		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}

}
=======
		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
