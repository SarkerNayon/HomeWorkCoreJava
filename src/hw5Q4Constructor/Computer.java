/*
 * Create a package name "hw5Q4Constructor" in your HW project. Inside the package, a) Create a class "Computer".
 * Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). 
 * Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. 
 * b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. 
 * I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- 
 * > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. 
 * I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable.
 * Organize your code. Push in the github. Paste your github link below. 
 * (Please paste the whole question inside the multiple line comments between package and class)
 */

package hw5Q4Constructor;

public class Computer {

	public String Brand;
	public String Model;
	public String OS;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {// Default Constructor
		System.out.println("This is default constructor from Computer Class.");
	}

	public Computer(String Brand, String Model, String OS, int price, char grade, boolean madeInUSA) { // Perametarized
																										// Constactor.
		this.Brand = Brand;
		this.Model = Model;
		this.OS = OS;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("My Brand : " + Brand + "\t Operating System : " + OS + "\t Price : " + price + "\t Grade : "
				+ grade + "\t Is made in USA :" + madeInUSA);

	}

	public Computer(String Brand) {
		this.Brand = Brand;
		System.out.println(" Manufecture by : " + Brand);
	}

	public Computer(String Brand, String Model, int price) {
		this.Brand = Brand;
		this.Model = Model;
		this.price = price;
		System.out.println(" Manufecture by : " + Brand + "\t Model is " + Model + "\t Price is: " + price);
	}

	public Computer(String Brand, String Model, String OS, int price, char grade) {
		this.Brand = Brand;
		this.Model = Model;
		this.OS = OS;
		this.price = price;
		this.grade = grade;
		System.out.println("My Brand : " + Brand + "\t Model is :" + Model + "\t Operating System : " + OS
				+ "\t Price : " + price + "\t Grade :" + grade);

	}

}
