package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {
	// Eredito name, age e i metodi dal padre
	// Possiamo anche aggiungere tutta una serie di caratteristiche proprie dei cani
	public boolean isACop;

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void getInfo() {
		System.out.println("Il mio nome è: " + this.name);
		System.out.println("La mia età é: " + this.age);
		System.out.println("Sono un cane poliziotto?" + this.isACop);
		this.bark();
	}

	public void bark() { // è un metodo specifico che solo i cani hanno
		System.out.println("BAU");
	}

	@Override
	public void run() {
		System.out.println("Ciao sono un cane e sto correndo");
	}
}
