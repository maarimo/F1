package model.entities;

import model.entities.enums.Scuderia;

public class Driver {
	
	private String name;
	private Scuderia scuderia;
	
	public Driver() {
	}

	public Driver(String name, Scuderia scuderia) {
		this.name = name;
		this.scuderia = scuderia;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Scuderia getScuderia() {
		return scuderia;
	}

	public void setScuderia(Scuderia scuderia) {
		this.scuderia = scuderia;
	}
	
	//@Override
	public String toString() {
		return scuderia + " <---> " + name;
	}
	
	
	
}
