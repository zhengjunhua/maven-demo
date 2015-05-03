package com.dianping.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HandlerInterceptor2 extends HandlerInterceptorAdapter {

	private NamedThreadLocal<Long>  startTimeThreadLocal =  new NamedThreadLocal<Long>("StopWatch-StartTime");
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		startTimeThreadLocal.set(System.currentTimeMillis());
		
		System.out.println("===========HandlerInterceptor2 preHandle"); 

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("===========HandlerInterceptor2 postHandle");  
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		 long useTime = System.currentTimeMillis()-startTimeThreadLocal.get();
		
		 System.out.println("===========HandlerInterceptor2 afterCompletion. Use time:"+useTime);  
	}

}
