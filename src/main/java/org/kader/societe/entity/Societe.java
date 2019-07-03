package org.kader.societe.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Societe implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private String nomSociete;


}
