package HarshTricon.GoogleLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCon {
    @GetMapping("/")
    public String home() {
        return "Welcome in Home";
    }
    @GetMapping("/secure")
    public String secureHome() {
        return "Welcome in Secure Home";
    }

}
