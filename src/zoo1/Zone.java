package zoo1;

import java.util.Arrays;

public class Zone {
	
	private String nom = null;
	private Animal[] animaux = null;
	
	public Zone (String nom, Animal[] animal) {
		
		this.nom = nom;
		this.animaux = animal;
	}
	
	public Zone (String nom) {
		this.nom = nom;
		
	}
	
	public void addAnimal(Animal newAnimal) {
		if (animaux != null) {
			Animal[] tempAnimaux = new Animal[(animaux.length)+1];
			for (int i=0; i<animaux.length; i++) {
				tempAnimaux[i] = animaux[i] ;
			}
			tempAnimaux[(animaux.length)] = newAnimal;
			animaux = tempAnimaux;	
		}
		else {
			animaux = new Animal[1];
			animaux[0] = newAnimal;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal[] getAnimal() {
		return animaux;
	}

	public void setAnimal(Animal[] animal) {
		this.animaux = animal;
	}

	@Override
	public String toString() {
		return "\r\nZone [nom=" + nom + ", animaux=" + Arrays.toString(animaux) ;
	}
	
	
	/*public String toString() {
		
		return "Zone [nom = "+this.nom+"] \r\n animal [nom = "+animaux.toString()+"]";
	}*/
	
	
}
