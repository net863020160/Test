package main.java.cn.springframework.beans.factory;

import main.java.cn.springframework.beans.BeansException;

public interface BeanFactory {
	Object getBean(String name) throws BeansException;
	
	Object getBean(String name,Object... args) throws BeansException;

}
