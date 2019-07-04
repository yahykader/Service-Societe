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
    
    
    
/*	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Societe(Long id, String nomSociete) {
		super();
		this.id = id;
		this.nomSociete = nomSociete;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNomSociete() {
		return nomSociete;
	}



	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}*/
    
    

}
