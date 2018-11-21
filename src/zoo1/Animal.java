package zoo1;

public abstract class Animal {
	
	private String nom = null;
	private String type = null;
	private String regimeAlimentaire = null;
	
	public static final String ALIMENT_CARNIVORE = "carnivore";
	public static final String ALIMENT_HERBIVORE = "herbivore";
	public static final String ALIMENT_OMNIVORE = "omnivore";
	
	public Animal (String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom;
		this.type = type;
		this.regimeAlimentaire = regimeAlimentaire ;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	protected void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", regimeAlimentaire=" + regimeAlimentaire + "] ";
	}
	

	

}
