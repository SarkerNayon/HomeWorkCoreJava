package hw9Q3Polymorphism;

public class Sister {

	public Sister() {
		// Default constructor.
	}

	// parameterized Method implemented.
	public int ageOfSister(int age1) {
		System.out.println("Sister age is : " + age1);
		return 0;
	}

	// Static type Method Implemented.
	public static int ageOfSister(int age1, int age2) {
		int total = age1 + age2;
		return total;
	}

	// Final type Methos implemented.
	public final int ageOfSister(int age1, int age2, int age3) {
		int total2 = (age1 + age2) - age3;
		return total2;
	}

	// Void type method implemented.
	public void ageOfSister(int age1, int age2, int age3, int age4) {
		int total3 = age1 + age2 + age3 + age4;
		System.out.println("Total age of my sisters is : " + total3);
	}

	// Return type parameteried method implemented but one signature is string type.
	public int ageOfSister(int age1, int age2, int age3, String SisterName) {
		int total = age1 + age2 + Integer.parseInt(SisterName);
		System.out.println("Total number of my sister age :" + total);
		return total;
	}

}
