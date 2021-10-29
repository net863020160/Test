package main.java.cn.springframewore.beans.factory.support;

import main.java.cn.springframewore.beans.factory.config.BeanDefinition;
import main.java.cn.springframework.beans.BeansException;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
	@Override
	protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
		// TODO Auto-generated method stub
		Object bean = null;
		try {
			bean = beanDefinition.getBeanClass().newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO: handle exception
			throw new BeansException("Instantiation of bean failed", e);
			
		}
		addSingleton(beanName, bean);
		return bean;
	}

}
