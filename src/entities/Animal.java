package entities;

public class Animal {
	// I tratti comuni a tutti gli animali li metto in questa classe
	// Attributi
	protected String name;
	// Protected significa che possono accedervi solo chi sta in questa classe o in classi che la estendono
	private int age; // Private significa che può accedervi solo chi sta in questa classe

	// Costruttori
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void staticHello() {
		System.out.println("Ciao");
	}

	// Metodi
	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name);
	}
}
