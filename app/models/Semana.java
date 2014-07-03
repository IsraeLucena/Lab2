package models;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Semana {
	@Id
	@GeneratedValue
	private int id;
	
	public Semana() {
	}

}
