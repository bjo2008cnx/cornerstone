package com.ctrip.framework.cs.spring;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by jiang.j on 2017/6/8.
 */
public class FilterRegistrationCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            Class.forName("org.springframework.boot.context.embedded.FilterRegistrationBean");
            return true;
        }catch (Throwable e){
            return false;
        }
    }
}
