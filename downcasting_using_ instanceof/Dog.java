
class Dog extends Animal {
	
	
	static void method (Animal someAnimal) {
		if (someAnimal instanceof Dog) {
			Dog doggie = (Dog) someAnimal;
			System.out.println("downcasting completed successfully!!!");
		}
	}
	
	public static void main(String[] args) {
		Animal ani = new Dog();
		Dog.method(ani);
		
		//without instance of we would get a compile error in the following code:
		//Dog myDog = new Animal();
		
		// if we try to use typecasting, a ClassCastException is gonna be thrown:
		// Dog myDog = (Dog) new Animal();
	}
}