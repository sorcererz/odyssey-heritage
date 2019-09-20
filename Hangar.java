package exo.heritageOdyssey;

public class Hangar {

	public static void main(String[] args) {
		Car clio = new Car("Clio", 60);
		System.out.println(clio.doStuff());
		
		Boat titanic = new Boat("Titanic", 500);
		System.out.println(titanic.doStuff());
	}

}
