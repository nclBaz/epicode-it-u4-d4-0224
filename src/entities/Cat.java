package entities;

public class Cat extends Animal {
	// Eredito name, age e i metodi dal padre
	// Possiamo anche aggiungere tutta una serie di caratteristiche proprie dei gatti
	public boolean hasBoots;

	public Cat(String name, int age) {
		super(name, age); // setta i valori di name, age
	}

	public void meow() { // è un metodo specifico che solo i gatti hanno
		System.out.println("MIAO");
	}


}
