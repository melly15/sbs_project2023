package com.lsh.exam.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.lsh.exam.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class BeforeActionInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		Rq rq = new Rq(req, resp);
		req.setAttribute("rq", rq);
		System.out.println("실행가능가?");
		
		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}

}
