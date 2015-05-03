package com.dianping.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HandlerInterceptor1 extends HandlerInterceptorAdapter {

	private NamedThreadLocal<Long>  startTimeThreadLocal =  new NamedThreadLocal<Long>("StopWatch-StartTime");
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("===========HandlerInterceptor1 preHandle"); 
		
		startTimeThreadLocal.set(System.currentTimeMillis());
		
		System.out.println("@@@@@@servletPath:"+request.getServletPath());
		System.out.println("@@@@@@servletPath:"+request.getContextPath());
		
		if(request.getServletPath().startsWith("login")){
			
			return true;
		}
		
		request.getSession().setAttribute("soaname", "张三");
		
		if(request.getSession().getAttribute("soaname") != null){
			
			return true;
		}
		
		response.sendRedirect(request.getContextPath()+"/index.jsp");

		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("===========HandlerInterceptor1 postHandle");  
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		long useTime = System.currentTimeMillis()-startTimeThreadLocal.get();
		
		 System.out.println("===========HandlerInterceptor1 afterCompletion. Use time:"+(useTime));  
	}

}
