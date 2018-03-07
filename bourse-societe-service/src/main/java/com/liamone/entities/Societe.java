/**
 * 
 */
package com.liamone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author LIAMONE
 *
 */
@Entity
public class Societe {
	@Id
	@GeneratedValue
	private Long id;
	private String nomSociete;

	public Societe() {
		super();
	}

	public Societe(String nomSociete) {
		super();
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
	}
}
