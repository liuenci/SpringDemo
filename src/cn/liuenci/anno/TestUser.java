package cn.liuenci.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) context.getBean("user");
		user.add();
	}
	
	@Test
	public void testService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
	}
}
