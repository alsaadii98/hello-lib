package org.alsaadii98.simplelib.controller;

import org.alsaadii98.simplelib.util.ByeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    private static ByeUtil byeUtil;


    @GetMapping
    public String hello() {
        return byeUtil.sayBye();
    }
}
