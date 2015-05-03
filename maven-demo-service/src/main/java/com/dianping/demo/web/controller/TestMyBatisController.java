package com.dianping.demo.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dianping.poi.datainput.mapper.dppoi.ArticleMapper;
import com.dianping.poi.datainput.mapper.dppoi.TestUserMapper;
import com.dianping.poi.datainput.module.dppoi.TestUser;
import com.dianping.poi.datainput.module.query.dppoi.ArticleQuery;
import com.dianping.poi.datainput.module.query.dppoi.TestUserArticleListQuery;

@Controller
@RequestMapping("/testmybatis") 
public class TestMyBatisController{

	@Autowired
	private TestUserMapper testUserMapper;
	
	@Autowired
	private ArticleMapper articleMapper;
	
	@InitBinder("user")  
    public void initBinder(WebDataBinder binder) {  
		
		System.out.println("------------------TestMyBatisController.initBinder()---------------------"); 
		
        binder.setFieldDefaultPrefix("user.");//别名前缀
    }
	
	@InitBinder("user2")  
	public void initBinder2(WebDataBinder binder) {  
		
		System.out.println("------------------TestMyBatisController.initBinder2()---------------------"); 
		
		binder.setFieldDefaultPrefix("user2.");//别名前缀
	}
	
	@RequestMapping("/qryByID")  
	public ModelAndView qryByID(@ModelAttribute("user") TestUser user, @ModelAttribute("user2") TestUser user2) throws Exception{
		
		System.out.println("@@@req user:"+user);
		System.out.println("@@@req user2:"+user2);
		
		ModelAndView mav = new ModelAndView();
			
		TestUser testUser = testUserMapper.selectByPrimaryKey(user.getId());
		
		System.out.println("@@@testUser"+testUser);
		
		mav.setViewName("TestMyBatisResult");
		
		mav.addObject("testUser", testUser);
		
		mav.addObject("result", "成功");
			
		return mav;
	}
	
	@RequestMapping("/qryList")
	public ModelAndView qryList(){
		
		ModelAndView mav = new ModelAndView();
		
		List<TestUser> testUserList = testUserMapper.qryList();
		
		System.out.println("@@@testUserList:"+testUserList);
		
		mav.setViewName("TestMyBatisResult");
		
		mav.addObject("testUserList",testUserList);
		
		return mav;
	}
	
	@RequestMapping("/xmlOrJson")
	@ResponseBody
	public Map<String, Object> xmlOrJson(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<TestUser> testUserList = testUserMapper.qryList();
		
		System.out.println("@@@testUserList:"+testUserList);
		
		map.put("testUserList", testUserList);
		
		return map;
	}
	
	@RequestMapping("/testParam")
	public ModelAndView testParam(HttpServletRequest request, HttpServletResponse response, TestUser testUser, String username, Map<String,Object> map, Model model){
		
		String requestUsername = (String) request.getAttribute("username");
		
		String requestParamUsername = request.getParameter("username");
		
		System.out.println("@@@requestUsername:"+requestUsername);
		System.out.println("@@@requestParamUsername:"+requestParamUsername);
		System.out.println("@@@testUser:"+testUser.getUsername());
		System.out.println("@@@username:"+username);
		
		map.put("mapResult", "mapResultValue");
		
		model.addAttribute("modelResult", "modelResultValue");
		
		Map<String, Object> modelViewMap = new HashMap<String, Object>();
		
		modelViewMap.put("modelViewResult", "modelViewResultValue");
		
		return new ModelAndView("TestMyBatisResult",modelViewMap);
	}
	
	@RequestMapping("/addTestUser")
	public ModelAndView addTestUser(TestUser user){
		
		int affectCount = testUserMapper.addTestUser(user);
		//int affectCount = testUserMapper.insertSelective(user);

		System.out.println("@@@affectCount:"+affectCount);
		System.out.println("@@@id:"+user.getId());
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("affectCount", affectCount);
		
		return new ModelAndView("TestMyBatisResult",resultMap);
		
	}
	
	@RequestMapping("/updTestUser")
	public ModelAndView updTestUser(TestUser user){
		
		int affectCount = testUserMapper.updTestUser(user);
		//int affectCount = testUserMapper.insertSelective(user);

		System.out.println("@@@affectCount:"+affectCount);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("affectCount", affectCount);
		
		return new ModelAndView("TestMyBatisResult",resultMap);
		
	}
	
	@RequestMapping("/delTestUser")
	public ModelAndView delTestUser(TestUser user){
		
		int affectCount = testUserMapper.delTestUser(user);
		//int affectCount = testUserMapper.insertSelective(user);
		
		System.out.println("@@@affectCount:"+affectCount);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("affectCount", affectCount);
		
		return new ModelAndView("TestMyBatisResult",resultMap);
		
	}
	
	@RequestMapping("/getUserArticles")
	public ModelAndView getUserArticles(int userID){
		
		List<ArticleQuery> userArticles = articleMapper.getUserArticles(userID);
		
		System.out.println("@@@userArticles:"+userArticles);
		
		List<TestUserArticleListQuery> testUserArticleList = testUserMapper.getUserArticles(userID);
		
		System.out.println("@@@testUserArticleList:"+testUserArticleList);
		
		return new ModelAndView("TestMyBatisResult");
	}
}
