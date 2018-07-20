package com.caojiebing.web.springbootweb01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;

public interface MySpringApplication extends ApplicationContext {


    @Override
    <T> T getBean(String name, @Nullable Class<T> requiredType) throws BeansException;

    @Nullable
    @Override
    BeanFactory getParentBeanFactory();
}
