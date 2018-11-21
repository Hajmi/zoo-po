package zoo1;

import java.util.Arrays;
/**
 * 
 * @author Samir Benakcha
 * @since 21/11/2018
 *
 */
public class Zoo {
	private String nom;
	
	private Zone[] zones;
	
	public static final int INDICE_SAVANE_AFRICAINE = 0;
	public static final int INDICE_ZONE_CARNIVORE = 1;
	public static final int INDICE_AQUARIUM = 2;
	public static final int INDICE_FERME_REPTILES = 3;
	public static final int INDICE_VOLIERES = 4;
	/**
	 * 
	 * @param nom de la classe zoo
	 */
	public Zoo(String nom) {
		super();
		this.nom = nom;
		zones = new Zone[5];
		zones[INDICE_SAVANE_AFRICAINE ] = new Zone("Savane africaine");
		zones[INDICE_ZONE_CARNIVORE ] = new Zone("Zone carnivore");
		zones[INDICE_AQUARIUM] = new Zone("Aquarium");
		zones[INDICE_FERME_REPTILES] = new Zone("Ferme aux reptiles");
		zones[INDICE_VOLIERES] = new Zone("Volières");
		
	}

	public Zone[] getZones() {
		return zones;
	}

	public void setZones(Zone[] zones) {
		this.zones = zones;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void addAnimalToZone(Animal animal) {
		if (animal instanceof Mammifere ) {
			if (animal.getRegimeAlimentaire().equals(Mammifere.ALIMENT_CARNIVORE)) {
				zones[INDICE_ZONE_CARNIVORE].addAnimal(animal);
			}
		}
		if (animal instanceof Mammifere ) {
			if (animal.getRegimeAlimentaire().equals(Mammifere.ALIMENT_HERBIVORE)) {
				zones[INDICE_SAVANE_AFRICAINE].addAnimal(animal);
			}
		}
		if (animal instanceof Poisson ) {
			zones[INDICE_AQUARIUM].addAnimal(animal);
		}
		if (animal instanceof Reptile ) {
			zones[INDICE_FERME_REPTILES].addAnimal(animal);
		}
		if (animal instanceof Volatile ) {
			zones[INDICE_VOLIERES].addAnimal(animal);
		}
		
	}

	@Override
	public String toString() {
		return "Zoo => nom=" + nom + ", zones=" + Arrays.toString(zones) ;
	}
	
	

}
