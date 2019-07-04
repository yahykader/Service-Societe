package org.kader.societe.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class ControllerConfig {

    @Value("${me}")// injecte une propriete
    private String message;
    @GetMapping("/messages")
    public String returnMe(){

        return message;
    }
}
