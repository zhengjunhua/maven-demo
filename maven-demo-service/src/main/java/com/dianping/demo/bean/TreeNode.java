package com.dianping.demo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TreeNode implements Serializable {
private static final long serialVersionUID = 1L;
private Integer cid;
private String cname;
private Integer pid;
private List<TreeNode> nodes = new ArrayList<TreeNode>();
 
public TreeNode() {
}

public Integer getCid() {
	return cid;
}

public void setCid(Integer cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public Integer getPid() {
	return pid;
}

public void setPid(Integer pid) {
	this.pid = pid;
}

public List<TreeNode> getNodes() {
	return nodes;
}

public void setNodes(List<TreeNode> nodes) {
	this.nodes = nodes;
}

 
}
