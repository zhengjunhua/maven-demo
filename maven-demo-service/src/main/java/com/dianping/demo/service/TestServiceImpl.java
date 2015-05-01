package com.dianping.demo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.dianping.demo.tree.FlatNodeBean;
import com.dianping.demo.tree.NodeService;
import com.dianping.poi.datainput.mapper.dppoi.TBTreeMapper;
import com.dianping.poi.datainput.mapper.dppoi.UserRoleMapper;
import com.dianping.poi.datainput.module.dppoi.TBTree;
import com.dianping.poi.datainput.module.query.dppoi.UserRoleQuery;
import com.dianping.poi.datainput.module.query.dppoi.UserRoleTreeListQuery;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TBTreeMapper tbTreeMapper;
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	public String test(String arg) {

		List<UserRoleQuery> treeList = userRoleMapper.qryUserRoleTree();
		
		System.out.println("@@@@treeList:"+treeList);
		
		UserRoleTreeListQuery userRoleTreeListQuery = userRoleMapper.qryUserRoleTree2();
		
		System.out.println("@@@@userRoleTreeListQuery:"+userRoleTreeListQuery.getUserId());
		System.out.println("@@@@userRoleTreeListQuery:"+userRoleTreeListQuery.getTbTreeList());
		
		return "@@@@echo:" + arg;
	}
	
	private void test1(){
		
		List<TBTree> allTrees = tbTreeMapper.selectAll();
		
		List<FlatNodeBean> nodeList = new ArrayList<FlatNodeBean>();
		
		for(TBTree tree : allTrees){
			
			FlatNodeBean nodeBean = new FlatNodeBean();
			
			nodeBean.setNodeID(tree.getCid());
			nodeBean.setNodeName(tree.getCname());
			nodeBean.setParentID(tree.getPid());
			
			nodeList.add(nodeBean);
		}
		
		String json = new NodeService(nodeList).getTreeJOSN();
		
		System.out.println("@@@json:"+json);
	}

	public String testFile(File file) {

		try {
			FileInputStream fis = new FileInputStream(new File("/work/a"));

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			String data = "";

			while ((data = br.readLine()) != null) {

				System.out.println("@@@data:" + data);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return null;
	}

}
