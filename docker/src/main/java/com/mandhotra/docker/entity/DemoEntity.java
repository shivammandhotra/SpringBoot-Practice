package com.mandhotra.docker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
	@Id
	private int id;
	
	private String centerName;
	
	private String centerAddress;
}
