package org.kader.societe;

import org.kader.societe.entity.Societe;
import org.kader.societe.entity.repository.SocieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class SocieteApplication implements CommandLineRunner {

    @Autowired
    private SocieteRepository societeRepository;


    public static void main(String[] args) {
        SpringApplication.run(SocieteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Stream.of("BNP","CA","LCL","POSTALE").forEach(s-> societeRepository.save(new Societe(null,s)));
        societeRepository.findAll().forEach(s -> System.out.println(s.getNomSociete()));

    }
}
