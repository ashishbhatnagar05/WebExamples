package com.ashish.web.example.WebExamples;

import com.ashish.web.example.WebExamples.config.DynamicPropertyLoading;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebExamplesApplication {

  private static final Logger LOG = LoggerFactory.getLogger(WebExamplesApplication.class);

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(WebExamplesApplication.class, args);
    DynamicPropertyLoading bean = context.getBean(DynamicPropertyLoading.class);
    LOG.info("Type: " + bean.getType());
    LOG.info("Port: " + bean.getPort());
  }
}
