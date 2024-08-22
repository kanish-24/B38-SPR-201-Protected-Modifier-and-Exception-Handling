package pets;

import animals.Animal;

public class Dog extends Animal{

	    public void bark() {
	        // Accessing protected member 'name' and method 'makeSound' from superclass
	        name = "Buddy";
	        System.out.println(name + " says: ");
	        makeSound(); // This will print "Animal makes a sound"
	    }

	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.bark();
	    }
	

}
