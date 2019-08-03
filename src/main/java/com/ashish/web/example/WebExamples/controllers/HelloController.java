package com.ashish.web.example.WebExamples.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

  @GetMapping(value = "/message/{name}")
  public String hello(@PathVariable String name) {
    return "Hello " + name;
  }
}
