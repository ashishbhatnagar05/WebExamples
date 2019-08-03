package com.ashish.web.example.WebExamples.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

public class UserActivityFilter implements Filter {

  private static final Logger LOG = LoggerFactory.getLogger(UserActivityFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    LOG.info("UserActivityFilter.init()");
  }

  @Override
  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    LOG.info("UserActivityFilter.doFilter()-- Enter");
    filterChain.doFilter(servletRequest, servletResponse);
    LOG.info("UserActivityFilter.doFilter()-- Exit");
  }

  @Override
  public void destroy() {
    LOG.info("UserActivityFilter.destroy()");
  }
}
