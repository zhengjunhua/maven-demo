package com.dianping.demo.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service("IOCBeanFactory")
public class IOCBeanFactory implements ApplicationContextAware{
	
	private static ApplicationContext ctx;  
    
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		
		IOCBeanFactory.ctx = ctx;
		
	}
	
    public static Object getBean(String beanName){
    	
    	return ctx.getBean(beanName);
    }
    
    public static void main(String[] args) {
		
    	System.out.println(getBean("testUserMapper"));
	}
}
