package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 配置项:控制器、视图解析器以及处理器映射
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.mvc.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 配置静态资源的处理
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        /**
         * 要求DispatcherServlet将对静态资源的请求转发到Servlet容器中默认的Servlet上，
         * 而不是使用DispatcherServlet本身来处理 此类请求。
         */
        configurer.enable();
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        //resolver.setPrefix();
        resolver.setSuffix(".html");
        return resolver;
    }


}

