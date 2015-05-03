package com.dianping.poi.datainput.module.query.dppoi;

import com.dianping.poi.datainput.module.dppoi.Article;
import com.dianping.poi.datainput.module.dppoi.TestUser;

public class ArticleQuery extends Article{

	private TestUser testUser;

	public TestUser getTestUser() {
		return testUser;
	}

	public void setTestUser(TestUser testUser) {
		this.testUser = testUser;
	}

	@Override
	public String toString() {
		return "ArticleQuery [testUser=" + testUser + "] Article [id=" + getId() + ", userid=" + getUserid() + ", title=" + getTitle()
				+ ", content=" + getContent() + "] ";
	}
	
	
}
