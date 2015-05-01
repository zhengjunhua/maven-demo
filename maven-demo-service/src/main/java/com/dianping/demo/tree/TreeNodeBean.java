package com.dianping.demo.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeBean {

	 private Integer nodeID;  
	 
	 private String nodeName; 
	 
	 private List<TreeNodeBean> nodes = new ArrayList<TreeNodeBean>();

	public Integer getNodeID() {
		return nodeID;
	}

	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public List<TreeNodeBean> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeNodeBean> nodes) {
		this.nodes = nodes;
	}

	 
	 
}
