package org.example.project12;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.project12")
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class MyConfig {
}
