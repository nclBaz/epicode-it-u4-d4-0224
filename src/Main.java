import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;
import interfaces.Jumper;
import interfaces.Runner;

public class Main {
	public static void main(String[] args) {

/*		Animal a = new Animal("Nome", 20);
		a.sayYourName();*/

		Cat felix = new Cat("Felix", 13);
		felix.sayYourName();

		Dog rex = new Dog("Rex", 4);
		rex.sayYourName();

		Animal.staticHello();
		Cat.staticHello();

		felix.meow();
		felix.hasBoots = true;

		rex.bark();
		rex.isACop = true;

		System.out.println(rex);

		// OVERLOAD
		felix.walk(2);
		felix.walk();

		felix.getInfo();
		rex.getInfo();

		// ************************************* POLIMORFISMO ************************************
		System.out.println(" --------------------- POLIMORFISMO ---------------------- ");

		// Il polimorfismo è la caratterstica di ogni oggetto di avere 'più forme', nel nostro caso un Cat è sia Cat che Animal che Object che Jumper
		// Un Dog è sia Dog che Animal che Object che Runner e così via

		Animal[] animals = {felix, rex, new Dog("Rintintin", 20)}; // Grazie al polimorfismo posso creare array 'misti'

		for (int i = 0; i < animals.length; i++) {
			Animal currentAnimal = animals[i];
			// Se inserisco cani e gatti nello stesso array di Animal probabilmente è perché
			// voglio usare i metodi che solo gli Animal possiedono, non quelli specifici di Cat & Dog
			// Se volessi potrei comunque riuscire a farlo
			// currentAnimal.sayYourName();
			if (currentAnimal instanceof Dog) { // Posso controllare se l'animale in questione è un Dog
				((Dog) currentAnimal).bark(); // CAST ESPLICITO, qua è safe farlo perché ho prima controllato con l'if se lo posso fare
			} else { // Per esclusione se non è un Dog sarà un Cat
				((Cat) currentAnimal).meow(); // CAST ESPLICITO, qua è safe farlo perché ho prima controllato con l'if se lo posso fare
			}
		}

		Student aldo = new Student("Aldo", "Baglio");

		Runner[] runners = {rex, aldo};

		for (int i = 0; i < runners.length; i++) {
			runners[i].run();
		}

		Jumper[] jumpers = {aldo, felix};
		for (int i = 0; i < jumpers.length; i++) {
			jumpers[i].jump();
		}

		printAnimal(felix);
		printAnimal(rex);
	}

	public static void printAnimal(Animal a) { // Inoltre il polimorfismo mi consente di creare dei metodi che prendano dei parametri più generici
		// Questo metodo ad esempio accetta qualsiasi tipo di Animal, quindi sia Cat che Dog
		System.out.println(a);
		a.sayYourName();
	}

/*	public static void printAnimal(Dog d) {
		System.out.println(d);
		d.sayYourName();
	}*/
}