package entities;

public class Dog extends Animal {
	// Eredito name, age e i metodi dal padre
	// Possiamo anche aggiungere tutta una serie di caratteristiche proprie dei cani
	public boolean isACop;

	public Dog(String name, int age) {
		super(name, age);
	}

	public void bark() { // è un metodo specifico che solo i cani hanno
		System.out.println("BAU");
	}
}
