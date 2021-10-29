package main.java.cn.springframewore.beans.factory.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import main.java.cn.springframewore.beans.factory.config.BeanDefinition;
import main.java.cn.springframework.beans.BeansException;

public class SimpleInstantiationStrategy implements InstantiationStrategy {
	@Override
	public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
			throws BeansException {
		// TODO Auto-generated method stub
		Class clazz = beanDefinition.getBeanClass();
		try {
			if (null != ctor) {
				return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);

			} else {
				return clazz.getDeclaredConstructor().newInstance();
			}
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException
				| InvocationTargetException e) {
			// TODO: handle exception
			throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
		}
	}

}
