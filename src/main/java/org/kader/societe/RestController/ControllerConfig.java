package org.kader.societe.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope // pour rafraichir les parametres qui jinjecter via value va ré-inialiser
@RestController
public class ControllerConfig {

    @Value("${email}")// injecte une propriete
    private String email;
    @Value("${prenom}")// injecte une propriete
    private String prenom;
    @Value("${nom}")// injecte une propriete
    private String nom;

    @GetMapping("/myconfig")
    public Map<String,Object> returnMe(){
         Map<String,Object> params= new HashMap<>();
             params.put("email",email);
             params.put("prenom",prenom);
             params.put("nom",nom);
             params.put("Thread",Thread.currentThread().getName());
        return params;
    }
}
