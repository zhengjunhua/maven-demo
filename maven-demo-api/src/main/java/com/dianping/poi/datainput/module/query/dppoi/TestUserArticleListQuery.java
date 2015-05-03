package com.dianping.poi.datainput.module.query.dppoi;

import java.util.List;

import com.dianping.poi.datainput.module.dppoi.Article;
import com.dianping.poi.datainput.module.dppoi.TestUser;

public class TestUserArticleListQuery extends TestUser {

	private List<Article> articleList;

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	@Override
	public String toString() {
		return "TestUser [id=" + getId() + ", username=" + getUsername() + ", userage="
				+ getUserage() + ", useraddress=" + getUseraddress() + "] TestUserArticleListQuery [articleList=" + articleList + "]";
	}
	
	
}
