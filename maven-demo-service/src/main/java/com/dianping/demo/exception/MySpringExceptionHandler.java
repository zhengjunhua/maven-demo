package com.dianping.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.apache.avalon.framework.parameters.ParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MySpringExceptionHandler{

	@ExceptionHandler(Exception.class)
	public ModelAndView resolveException(Exception ex) {
		
		System.out.println("enter into MyExceptionHandler");
		
		ex.printStackTrace();
		
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
