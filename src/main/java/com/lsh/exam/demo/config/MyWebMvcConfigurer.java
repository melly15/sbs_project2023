package com.lsh.exam.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.lsh.exam.demo.interceptor.BeforeActionInterceptor;
import com.lsh.exam.demo.interceptor.NeedLoginInterceptor;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
	@Autowired
	// BeforeActionInterceptor 불러오기
	BeforeActionInterceptor beforeActionInterceptor;

	@Autowired
	// NeedLoginInterceptor 불러오기
	NeedLoginInterceptor needLoginInterceptor;

	// 이 함수는 인터셉터를 적용하는 역할을 합니다.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(beforeActionInterceptor).addPathPatterns("/**").excludePathPatterns("/error")
				.excludePathPatterns("/resource/**");

		registry.addInterceptor(needLoginInterceptor).addPathPatterns("/usr/article/write")
				.addPathPatterns("/usr/article/doWrite").addPathPatterns("/usr/article/modify")
				.addPathPatterns("/usr/article/doModify").addPathPatterns("/usr/article/doDelete");
	}

}
<<<<<<< HEAD
=======
=======
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer{
   
   @Autowired
   BeforeActionInterceptor beforeActionInterceptor;
   @Autowired
   NeedLoginInterceptor needLoginInterceptor;

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(beforeActionInterceptor)
            .addPathPatterns("/**")
            .excludePathPatterns("/error")
            .excludePathPatterns("/resources/**");
      
      registry.addInterceptor(needLoginInterceptor)
            .addPathPatterns("/usr/article/write")
            .addPathPatterns("/usr/article/doWrite")
            .addPathPatterns("/usr/article/modify")
            .addPathPatterns("/usr/article/doModify")
            .addPathPatterns("/usr/article/doDelete");
   }
   
   
}
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
