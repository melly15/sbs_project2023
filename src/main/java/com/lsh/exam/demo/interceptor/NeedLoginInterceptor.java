package com.lsh.exam.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.lsh.exam.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
<<<<<<< HEAD
//로그인 담당 Interceptor
public class NeedLoginInterceptor implements HandlerInterceptor{
	private Rq rq;
	
	public NeedLoginInterceptor(Rq rq) {
		this.rq = rq;
	}
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
	
		if (!rq.isLogined()) {
			rq.printHistoryBackJs("로그인 후 이용 해주세요.");
=======
public class NeedLoginInterceptor implements HandlerInterceptor {
	private Rq rq;

	public NeedLoginInterceptor(Rq rq) {
		this.rq = rq;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		if (!rq.isLogined() ) {
			rq.printHistoryBackJs("로그인 후 이용해주세요.");
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
			return false;
		}
		
		System.out.println("로그인 필요!");

		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}
<<<<<<< HEAD

}
=======
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
