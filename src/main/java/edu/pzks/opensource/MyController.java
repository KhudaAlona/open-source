package edu.pzks.opensource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class MyController {


    @GetMapping("/hello/user")
    public String helloUser() {
        return "<h1>hello user</h1>";
    }

    @GetMapping("/hello/admin")
    public String helloAdmin() {
        return "hello admin";
    }

    @GetMapping("/hello/unknown")
    public String helloUnknown() {
        return "hello unknown";
    }
}
