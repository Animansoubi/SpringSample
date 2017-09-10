package com.aban.authorization.Controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @RequestMapping("/hello")
    @Secured("ROLE_USER")
    public String sayHello() {
        return "Hello User";
    }
}
