package com.example.inlamning2webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getUnauthContent() {
        return "Index - " +
                "/authcontent " +
                "/moreauthcontent";
    }

    @GetMapping("/authcontent")
    public String getAuthContent() {
        return "authcontent";
    }

    @GetMapping("/moreauthcontent")
    public String getMoreAuthContent() {
        return "moreauthcontent";
    }

}
