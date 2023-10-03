package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ping")
@RestController
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "ОК";
    }
}

