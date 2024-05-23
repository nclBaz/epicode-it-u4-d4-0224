package entities;

import java.util.Objects;

public abstract class Animal {
	// Abstract <-- non si possono creare oggetti di tipo Animal
	// Evidentemente non ne abbiamo bisogno e non sarebbe neanche magari sensato avere oggetti così "generici"
	// Vogliamo comunque che questa classe fornisca una serie di metodi e attributi a dei figli

	// I tratti comuni a tutti gli animali li metto in questa classe
	// Attributi
	protected String name;
	// Protected significa che possono accedervi solo chi sta in questa classe o in classi che la estendono
	//private int age; // Private significa che può accedervi solo chi sta in questa classe
	protected int age;

	// Costruttori
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void staticHello() {
		System.out.println("Ciao");
	}

	// METODI CONCRETI
	// I metodi concreti vengono ereditati dai figli, essi possono scegliere se usare
	// quello del padre oppure sovrascriverlo con un @Override
	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name);
	}

	// METODI ASTRATTI
	// I metodi astratti sono dei metodi vuoti che servono solo
	// per 'forzare' i figli ad avere questo metodo implementato
	// Essi lo implementeranno a loro discrezione, non è il padre a definire che cosa dovrà
	// fare questo metodo
	public abstract void getInfo();

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) { // <-- Esempio di polimorfismo
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o; // <-- qua posso fare un cast da Object a Animal perché alla riga precedente con un if ho controllato che la classe sia la stessa
		return age == animal.age && Objects.equals(name, animal.name);
	}

}
