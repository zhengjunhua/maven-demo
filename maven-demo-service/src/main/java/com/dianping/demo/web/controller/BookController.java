package com.dianping.demo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
@RequestMapping("/book")  
public class BookController {  
  
    
    @RequestMapping(params = "method=add")  
    public String add(Book book){  
    	
        System.out.println("bookname:"+book.getName());  
        
        System.out.println("author:"+book.getAuthor()); 
        
        return "success";  
        
    } 
    
    @RequestMapping(params = "method=add1")   
    public ModelAndView add(HttpServletRequest request, ModelMap modelMap, Book book) throws Exception{  
    	
    	String name = request.getParameter("name"); 
    	
    	System.out.println("@@@name:"+name);
    	
    	System.out.println("@@@book:"+book);
    	
    	System.out.println("@@@modelMap:"+modelMap);
    	
    	System.out.println("@@@modelMap bookBean:"+modelMap.get("book"));
    	
    	ModelAndView mav = new ModelAndView();
    	
    	mav.addObject("result", "反馈结果");
    	
    	mav.setViewName("success");
    	
        return mav;   
    }
    
    @RequestMapping(params = "method=update")  
    public String update(Book book) {  
    	
        return "success";  
        
    }  
      
}  
