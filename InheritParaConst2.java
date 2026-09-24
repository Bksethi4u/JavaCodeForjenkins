package pratice_22th_june2026;
class Animal {
    String name;

    // Parameterized constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }
}

class Dog extends Animal {
    int age;

    // Parameterized constructor
    Dog(String name, int age) {
        super(name);    // Calls Animal constructor
        this.age = age;
        System.out.println("Dog Constructor Called");
    }
}

class Puppy extends Dog {
    String breed;

    // Parameterized constructor
    Puppy(String name, int age, String breed) {
        super(name, age);   // Calls Dog constructor
        this.breed = breed;
        System.out.println("Puppy Constructor Called");
    }

    void display() {
        System.out.println("\nDog Details");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Breed : " + breed);
    }
}


public class InheritParaConst2 {

	public static void main(String[] args) {
		 Puppy p = new Puppy("Buddy", 2, "Golden Retriever");
	        p.display();
	}

}
