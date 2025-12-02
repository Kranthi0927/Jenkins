//package com.example.JenkinsDemo;
//
//public class HomeController {
//
//}
package com.example.JenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")             // maps root path
    public String home() {
        return "Hello from Docker + Jenkins!";
    }
}
