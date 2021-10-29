package main.java.cn.springframewore.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

import main.java.cn.springframewore.beans.factory.config.BeanDefinition;
import main.java.cn.springframework.beans.BeansException;

public class DefaultListtableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistory {
	private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
		// TODO Auto-generated method stub
		beanDefinitionMap.put(beanName, beanDefinition);

	}

	@Override
	protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
		// TODO Auto-generated method stub
		BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
		if (beanDefinition == null)
			throw new BeansException("No bean named" + beanName + "is defined");
		return beanDefinition;
	}
	

}
