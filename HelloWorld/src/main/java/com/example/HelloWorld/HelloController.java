package com.example.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "<h1>Hello from BridgeLabz</h1>";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + name + "!";
    }

    // Make REST Call to show Hello {name} from BridgeLabz as path variable
    @GetMapping("/hello/param/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz";
    }

    @PostMapping("/hello/post")
    public String greetUser(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("hello/put/{firstName}/")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}




