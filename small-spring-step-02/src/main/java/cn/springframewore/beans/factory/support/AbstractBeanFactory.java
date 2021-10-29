package main.java.cn.springframewore.beans.factory.support;

import main.java.cn.springframewore.beans.factory.config.BeanDefinition;
import main.java.cn.springframework.beans.BeansException;
import main.java.cn.springframework.beans.factory.BeanFactory;

public abstract class AbstractBeanFactory extends DefaultSingleonBeanRegistry implements BeanFactory {
	@Override
	public Object getBean(String name) throws BeansException {
		// TODO Auto-generated method stub
		Object bean = getSingleton(name);
		if(bean != null){
			return bean;
		}
		BeanDefinition beanDefinition = getBeanDefinition(name);
		return createBean(name, beanDefinition);
	}
	
	protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
	
	protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;

}
