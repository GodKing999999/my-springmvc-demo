package com.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.mvc"},excludeFilters={@ComponentScan.Filter(EnableWebMvc.class)})
public class RootConfig {
}
