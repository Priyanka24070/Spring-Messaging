package com.example.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "<h1>Hello from BridgeLabz</h1>";
    }
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value="name")String name) {
        return "Hello" + name + "!";
    }
}


