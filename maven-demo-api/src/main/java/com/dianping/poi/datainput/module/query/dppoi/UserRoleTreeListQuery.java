package com.dianping.poi.datainput.module.query.dppoi;

import java.util.List;

import com.dianping.poi.datainput.module.dppoi.TBTree;
import com.dianping.poi.datainput.module.dppoi.UserRole;

public class UserRoleTreeListQuery extends UserRole{

	private List<TBTree> tbTreeList;

	public List<TBTree> getTbTreeList() {
		return tbTreeList;
	}

	public void setTbTreeList(List<TBTree> tbTreeList) {
		this.tbTreeList = tbTreeList;
	}

	@Override
	public String toString() {
		return "UserRoleTreeListQuery [tbTreeList=" + tbTreeList + "]";
	}
	
	
}
