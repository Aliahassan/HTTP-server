package com.example.Http_Server.Config;

import com.example.Http_Server.Servlets.IndexServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean<IndexServlet> indexServlet() {
        return new ServletRegistrationBean<>(new IndexServlet(), "/index");
    }
}
