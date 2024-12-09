package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: wwq
 * @date: 2024/12/03/17:32
 */
public interface AfterReturningAdvice extends Advice {

    void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable;
}