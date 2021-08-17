/*
 * Now create a class "TestAnimal". Under the main method create an object from each class and call their own method by their own object.
 * Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class, 
 * for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc. 
 * An object Can call other methods if the class is extended, if yes, show all the possible calls. 
 * 
 * (ask) Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. 
 * Also, show by java comments who is Parent class and who is child class. Organize the code. Push the code in Github. Paste your github link below.
 */

package hw6Q3Inheritance;

public class TestAnimal{

	public static void main(String[] args) {
		// This is my main Method
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("---------------------------------------------------");

		Birds birds = new Birds(); //
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("---------------------------------------------------");

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("---------------------------------------------------");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("---------------------------------------------------");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("---------------------------------------------------");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("---------------------------------------------------");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("---------------------------------------------------");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("---------------------------------------------------");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

	}

}
