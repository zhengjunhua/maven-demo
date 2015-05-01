package com.dianping.poi.datainput.module.query.dppoi;

import com.dianping.poi.datainput.module.dppoi.TBTree;

public class UserRoleQuery extends TBTree {

	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserRoleQuery [userId=" + userId + "]" + "TBTree [cid=" + this.getCid() + ", cname=" + this.getCname() + ", pid=" + this.getPid() + "]";
	}
	
	
}
