package main.java.cn.springframewore.beans.factory.support;


import main.java.cn.springframewore.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistory {
	void registerBeanDefinition(String beanName,BeanDefinition beanDefinition);

}
