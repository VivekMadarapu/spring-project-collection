package com.vvk.learn.sfid.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.frankmoley.lil.fid")
public class ApplicationConfig {


}
