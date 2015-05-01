package com.dianping.demo.service.test;

import java.io.File;

import com.dianping.demo.service.TestService;
import com.dianping.pigeon.container.SpringContainer;

public class TestClient {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:config/spring/appcontext1-invoker.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		CLIENT_CONTAINER.start();

		// TidyCategoryService tidyCategoryService = (TidyCategoryService)
		// CLIENT_CONTAINER.getBean("tidyCategoryService");
		//
		// tidyCategoryService.tidyData(new File("/work/newCategory.xlsx"));

		TestService testService = (TestService) CLIENT_CONTAINER
				.getBean("testService");

		testService.testFile(new File("/work/a.rtf"));
	}

}
