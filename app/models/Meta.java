package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Meta")
public class Meta {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int semana;
	private int prioridade;

	public Meta() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	// compara se são da mesma semana e com a mesma prioridade
	public int compareTo(Meta A, Meta B) {
		int resultado = 0;
		if (A.getSemana() == B.getSemana()) {
			if (A.getPrioridade() == B.getPrioridade()) {
				return resultado;
			} else {
				// setar a maior prioridade
				return resultado;
			}
		} else {
			// setar a maior data
			return resultado;
		}

	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

}
