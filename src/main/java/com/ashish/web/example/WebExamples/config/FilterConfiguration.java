package com.ashish.web.example.WebExamples.config;

import com.ashish.web.example.WebExamples.filter.UserActivityFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

  @Bean
  public FilterRegistrationBean customLogger() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new UserActivityFilter());
    filterRegistrationBean.addUrlPatterns("/users/*");
    return filterRegistrationBean;
  }
}
