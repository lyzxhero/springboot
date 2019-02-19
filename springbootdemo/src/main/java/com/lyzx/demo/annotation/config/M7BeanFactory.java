package com.lyzx.demo.annotation.config;

import org.springframework.beans.factory.FactoryBean;


public class M7BeanFactory implements FactoryBean<M7> {

    @Override
    public M7 getObject() throws Exception {
        return new M7();
    }

    @Override
    public Class<?> getObjectType() {
        return M7.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
