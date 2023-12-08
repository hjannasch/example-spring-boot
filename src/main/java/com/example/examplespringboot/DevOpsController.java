package com.example.examplespringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class DevOpsController {

    Logger logger = LoggerFactory.getLogger(DevOpsController.class);

    public DevOpsController() {
    }

    @GetMapping
    public String home() {
        logger.info("DevOps Controller called");
        return "Hello ZID DevOps";
    }
}