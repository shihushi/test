package com.di.container;

public class NoSuchBeanDefinitionException extends RuntimeException {
    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }
}
