package com.dianping.demo.tree;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;

public class NodeService {
	
	private List<FlatNodeBean> flatNodeList;
	
	public NodeService(List<FlatNodeBean> flatNodeList){
		
		this.flatNodeList = flatNodeList;
	}
	
	public String getTreeJOSN(){
		
		return JSONArray.toJSONString(buildTree());
	}
	
	/**
	 * 创建树形结构
	 * @return
	 */
	private TreeNodeBean buildTree(){  
        
		TreeNodeBean topNode = new TreeNodeBean();
		
		topNode.setNodeID(0);
		
		topNode.setNodeName("顶层");
		
		List<TreeNodeBean> treeNodeList = new ArrayList<TreeNodeBean>();
		
        for (FlatNodeBean flatNodeBean : flatNodeList) {  
        	
        	//先处理类目频道层级
        	if(flatNodeBean.getParentID()==0){
        		
        		TreeNodeBean treeNodeBean = new TreeNodeBean();
        		
        		treeNodeBean.setNodeID(flatNodeBean.getNodeID());
        		
        		treeNodeBean.setNodeName(flatNodeBean.getNodeName());
        		
        		//获取频道的子类目
        		treeNodeBean.setNodes(buildChildren(flatNodeBean));
        		
        		treeNodeList.add(treeNodeBean);
        	}
        }  
        
        topNode.setNodes(treeNodeList);
        
        return topNode;  
    }  
	
	/**
	 * 创建子类目的树形结构
	 * @param curFlatNodeBean
	 * @return
	 */
	private List<TreeNodeBean> buildChildren(FlatNodeBean curFlatNodeBean){
		
		List<TreeNodeBean> nodeList = new ArrayList<TreeNodeBean>();
		
		//获取当前类目的所有子类目
		List<FlatNodeBean> children = getChildren(curFlatNodeBean);
		
		//如果不存在，则为子类目
		if (!children.isEmpty()) { 
			
			//循环子类目，创建树形结构
			for (FlatNodeBean child : children) { 
				
				TreeNodeBean treeNodeBean = new TreeNodeBean();
        		
        		treeNodeBean.setNodeID(child.getNodeID());
        		
        		treeNodeBean.setNodeName(child.getNodeName());
        		
        		//递归调用，创建多层级的树形结构
        		treeNodeBean.setNodes(buildChildren(child));
        		
        		nodeList.add(treeNodeBean);
            }  
		}
		
		return nodeList;
	}
	
	/**
	 * 查找某个节点的所有子节点
	 * @param curFlatNodeBean
	 * @return
	 */
	private List<FlatNodeBean> getChildren(FlatNodeBean curFlatNodeBean){  
		
        List<FlatNodeBean> children = new ArrayList<FlatNodeBean>();
        
        Integer curID = curFlatNodeBean.getNodeID();  
        
        for (FlatNodeBean each : flatNodeList) {  
        	
            if (curID.equals(each.getParentID())) {  
            	
                children.add(each);  
                
            }  
        }  
        
        return children;  
    }  
}
