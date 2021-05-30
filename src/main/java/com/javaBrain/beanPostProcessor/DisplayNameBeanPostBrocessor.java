package com.javaBrain.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class DisplayNameBeanPostBrocessor implements BeanPostProcessor {

    @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Befor the Initialization . beanName : "+ beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After the Initialization . beanName : "+ beanName);
        return bean;
    }

}
