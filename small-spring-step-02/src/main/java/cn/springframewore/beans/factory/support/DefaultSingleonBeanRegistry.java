package main.java.cn.springframewore.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

import main.java.cn.springframewore.beans.factory.config.SingletonBeanRegistry;

public class DefaultSingleonBeanRegistry implements SingletonBeanRegistry {

	private Map<String, Object> singletonObjects = new HashMap<>();

	@Override
	public Object getSingleton(String beanName) {
		// TODO Auto-generated method stub
		return singletonObjects.get(beanName);
	}

	protected void addSingleton(String beanName, Object singletonObject) {
		singletonObjects.put(beanName, singletonObject);
	}

}
