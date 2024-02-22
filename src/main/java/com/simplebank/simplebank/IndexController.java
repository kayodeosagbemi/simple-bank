package com.simplebank.simplebank;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "<h2>Simple Bank App</h2>" + 
        "<p>This is a simple Bank</p>";
    }

    
}
