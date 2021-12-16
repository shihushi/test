package com.di.container;

import java.io.InputStream;
import java.util.List;

public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
}
