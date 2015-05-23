package com.dianping.demo.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadCtr {

	@RequestMapping("/uploader")  
	public String uploader(@RequestParam("name") String name,  
	        @RequestParam("file") MultipartFile file,HttpSession session){  
	    if (!file.isEmpty()) {  
	        System.out.println(file.getSize());  
	    }  
	    return "success";  
	}  
}
