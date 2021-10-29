package main.java.cn.springframewore.beans.factory.support;

import java.lang.reflect.Constructor;

import main.java.cn.springframewore.beans.factory.config.BeanDefinition;
import main.java.cn.springframework.beans.BeansException;

public interface InstantiationStrategy {
	Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
