package com.ashish.web.example.WebExamples.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@Component
@Order(1)
public class ActivityFilter implements Filter {
  private static final Logger LOG = LoggerFactory.getLogger(ActivityFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    LOG.info("ActivityFilter :: init");
  }

  @Override
  public void destroy() {
    LOG.info("ActivityFilter :: destroy");
  }

  @Override
  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    LOG.info("ActivityFilter :: doFilter --entry");
    HttpServletRequest httpReq = (HttpServletRequest) servletRequest;
    Map<String, String[]> map = httpReq.getParameterMap();
    Set<String> keys = map.keySet();
    if (keys.size() != 0) {
      LOG.info("Below parameters are provided");
      keys.stream().forEach((key) -> LOG.info("parameter present: " + key));
    }
    filterChain.doFilter(servletRequest, servletResponse);
    LOG.info("Response .....");
    HttpServletResponse httpRes = (HttpServletResponse) servletResponse;
    LOG.info("ActivityFilter :: doFilter --exit");
  }
}
