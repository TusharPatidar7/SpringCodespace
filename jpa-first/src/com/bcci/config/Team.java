package com.bcci.config;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="teamindia")
@Entity
public class Team {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "captain")
	private String captain;
	
	@Column(name = "trophies")
	private int trophies;
	
	@Column(name = "years")
	private Date years;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	public Date getYears() {
		return years;
	}
	public void setYears(Date years) {
		this.years = years;
	}

}
