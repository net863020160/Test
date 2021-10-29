package test.java.cn.springframework.test;

import org.junit.Test;

import main.java.cn.springframewore.beans.factory.config.BeanDefinition;
import main.java.cn.springframewore.beans.factory.support.DefaultListtableBeanFactory;
import test.java.cn.springframework.test.bean.UserService;

public class ApiTest {
	@Test
	public void test_BeanFactory(){
		DefaultListtableBeanFactory beanFactory = new DefaultListtableBeanFactory();
		
		BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
		beanFactory.registerBeanDefinition("userService", beanDefinition);
		
		UserService userService = (UserService) beanFactory.getBean("userService");
		userService.queryUserInfo();
		
		UserService userService_singleton = (UserService) beanFactory.getBean("userService");
		userService_singleton.queryUserInfo();
	}

}
