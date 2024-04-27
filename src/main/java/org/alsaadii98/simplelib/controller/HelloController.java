package org.alsaadii98.simplelib.controller;

import org.alsaadii98.simplelib.util.HelloUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return HelloUtil.sayHello();
    }
}
