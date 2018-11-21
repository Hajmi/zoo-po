package zoo1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal an = new Mammifere("lion", "mammifere", Mammifere.ALIMENT_CARNIVORE);
		//Animal an1 = new Mammifere("hyene", "mammifere", Mammifere.ALIMENT_CARNIVORE);
		//Animal an2 = new Mammifere("tigre", "mammifere", Mammifere.ALIMENT_CARNIVORE);
		//Animal an3 = new Mammifere("jaguar","mammifere", Mammifere.ALIMENT_CARNIVORE);
		//Animal[] animals = {an,an1,an2};
		//Zone zone1 = new Zone("la jungle",animals);
		//System.out.println(zone1.toString());
		System.out.println("================================Ajout d'un Zoo=======================================\r\n");
		Zoo zoo1 = new Zoo("Zoo stylé");
		zoo1.addAnimalToZone(new Mammifere("lion","Mammifère" ,Mammifere.ALIMENT_CARNIVORE));
		zoo1.addAnimalToZone(new Mammifere("lion2","Mammifère" ,Mammifere.ALIMENT_CARNIVORE));
		zoo1.addAnimalToZone(new Mammifere("gazelle","Mammifère" ,Mammifere.ALIMENT_HERBIVORE));
		zoo1.addAnimalToZone(new Poisson("morue","Poisson" ,Poisson.ALIMENT_OMNIVORE));
		zoo1.addAnimalToZone(new Mammifere("antilope","Mammifère" ,Mammifere.ALIMENT_HERBIVORE));
		zoo1.addAnimalToZone(new Mammifere("zèbre","Mammifere",Mammifere.ALIMENT_HERBIVORE));
		zoo1.addAnimalToZone(new Poisson("requin","Poisson",Mammifere.ALIMENT_CARNIVORE));
		zoo1.addAnimalToZone(new Reptile("boa","Serpent",Mammifere.ALIMENT_CARNIVORE));
		zoo1.addAnimalToZone(new Reptile("anaconda","Serpent",Mammifere.ALIMENT_CARNIVORE));
		zoo1.addAnimalToZone(new Volatile("poule","Volatile",Mammifere.ALIMENT_OMNIVORE));
		
		System.out.println(zoo1.toString());
		
	}

}
