package com.esprit.picturenetwork.pojo;

import java.io.Serializable;



/**
 * Entity implementation class for Entity: BadWorld
 * 
 */

public class BadWorld implements Serializable {
 
	
	
	private int id;
	private String description;
	private static final long serialVersionUID = 1L;
	

	public BadWorld(String description) {
		super();
		this.description = description;
	}

	public BadWorld(int id) {
		super();
		this.id = id;
	}

	public BadWorld(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public BadWorld() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
