package com.dianping.demo.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.avalon.framework.parameters.ParameterException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MySpringExceptionHandler implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		
		System.out.println("enter into MyExceptionHandler");
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("ex", ex.getMessage());
		
		if(ex instanceof BusinessException){
			
			model.put("result", "业务处理异常");
			
			return new ModelAndView("error-business",model);
			
		}else if(ex instanceof ParameterException){
			
			model.put("result", "参数异常");
			
			return new ModelAndView("error-parameter",model);
			
		}else{
			
			model.put("result", "未知异常");
			
			return new ModelAndView("error",model);
		}
	}

	

}
