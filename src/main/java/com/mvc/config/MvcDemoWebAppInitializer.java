package com.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcDemoWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 指定 spring 容器
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        /**
         * 返回的类中带有@Configuration注解的类将会用来配置ContextLoaderListener创建的应用上下文中的bean。
         */
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 指定 springmvc 容器
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        /**
         * 返回的类中带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的 bean。
         */
        return new Class<?>[]{WebConfig.class};
    }

    /**
     * 配置 DispatcherServlet 的请求映射
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
