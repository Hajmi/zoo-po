package zoo;

public class Zone {
	
	private String nom;
	private Animal[] animal;
	
	public Zone (String nom, Animal[] animal) {
		super();
		this.nom = nom;
		this.animal = animal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal[] getAnimal() {
		return animal;
	}

	public void setAnimal(Animal[] animal) {
		this.animal = animal;
	}
	
	
}
