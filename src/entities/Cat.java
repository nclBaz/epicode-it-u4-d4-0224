package entities;

import interfaces.Jumper;

public class Cat extends Animal implements Jumper {
	// Eredito name, age e i metodi dal padre
	// Possiamo anche aggiungere tutta una serie di caratteristiche proprie dei gatti
	public boolean hasBoots;

	// I Costruttore
	public Cat(String name, int age) {
		super(name, age); // setta i valori di name, age
	}

	// II Costruttore
	public Cat(String name, int age, boolean hasBoots) { // <-- OVERLOAD DI COSTRUTTORE
		this(name, age); // <-- Posso richiamare il costruttore I
		this.hasBoots = hasBoots;
	}

	public void meow() { // è un metodo specifico che solo i gatti hanno
		System.out.println("MIAO");
	}

	@Override // <-- Ci serve per indicare che questo metodo SOVRASCRIVE un metodo del padre
	public void sayYourName() {
		super.sayYourName(); // <-- col super posso accedere anche ai metodi del padre
		System.out.println("Ciao sono un GATTO e mi chiamo " + this.name);
	}

	@Override
	public void getInfo() {
		System.out.println("Il mio nome è: " + this.name);
		System.out.println("La mia età é: " + this.age);
		System.out.println("Sono un gatto con gli stivali?" + this.hasBoots);
		this.meow();
	}

	public void walk() {
		System.out.println("Ciao sono un gatto e sto camminando");
	}

	public void walk(int numPassi) { // <-- OVERLOAD
		this.walk();
		System.out.println("Ciao sono un gatto e camminerò per " + numPassi + " passi");
	}

	@Override
	public void jump() {
		System.out.println("Ciao sono un gatto e sto saltando");
	}
}
