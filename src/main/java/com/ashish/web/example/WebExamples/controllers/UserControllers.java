package com.ashish.web.example.WebExamples.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserControllers {

  @GetMapping(value = "message")
  public String getMessage() {
    return "Hello User";
  }
}
