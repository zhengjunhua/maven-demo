package com.dianping.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dianping.poi.datainput.mapper.dppoi.TestUserMapper;
import com.dianping.poi.datainput.module.dppoi.TestUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class TestPageController {

	@Autowired
	private TestUserMapper testUserMapper;

	@RequestMapping("/testPage")
	public ModelAndView qryTestUserList(String username, int pageNum, int pageSize) {

		ModelAndView mav = new ModelAndView();
		
		try {
			
            PageHelper.startPage(pageNum, pageSize);
            
            List<TestUser> list = testUserMapper.qryListByName(username);
            
            PageInfo<TestUser> page = new PageInfo<TestUser>(list);
            
            mav.addObject("username", username);
            
            mav.addObject("page", page);
            
            mav.setViewName("TestUserPage");
            
        } catch (Exception e) {
        	
            e.printStackTrace();
        }
		
		return mav;
	}
}
