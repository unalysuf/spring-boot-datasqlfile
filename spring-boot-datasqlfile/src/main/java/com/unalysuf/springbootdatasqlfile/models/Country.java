package com.unalysuf.springbootdatasqlfile.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "countries")
public class Country {
	
	@Id
	private Long id;
	
	private String name;

}
