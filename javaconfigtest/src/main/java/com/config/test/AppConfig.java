package com.config.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Import使用，实际可以不使用，多个对象导入需要使用
 * 之所以使用AppConfig是为了把多个Bean集成到一起，get的时候比较方便
 * */

@Configuration
@Import({StudentConnfig.class})
public class AppConfig {

}
