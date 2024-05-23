import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {

		Animal a = new Animal("Nome", 20);
		a.sayYourName();

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
	}
}