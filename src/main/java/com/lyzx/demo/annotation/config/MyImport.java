package com.lyzx.demo.annotation.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImport implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.lyzx.demo.annotation.config.M3","com.lyzx.demo.annotation.config.M4"};
    }
}
