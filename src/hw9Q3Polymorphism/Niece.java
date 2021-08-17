package hw9Q3Polymorphism;

public class Niece extends Sister {

	public Niece() {
		// Default Constructor.
	}

	@Override
	public int ageOfSister(int age1) {
		// TODO Auto-generated method stub
		return super.ageOfSister(age1);
	}

	@Override
	public void ageOfSister(int age1, int age2, int age3, int age4) {
		// TODO Auto-generated method stub
		super.ageOfSister(age1, age2, age3, age4);
	}

	@Override
	public int ageOfSister(int age1, int age2, int age3, String SisterName) {
		// TODO Auto-generated method stub
		return super.ageOfSister(age1, age2, age3, SisterName);
	}

	// Final and Static type Methods are not possible to inherited.

	public final int ageOfNiece(int age1, int age2) {
		int total = age1 + age2;
		System.out.println("The total age of two nieces is : " + total);
		return total;

	}

	public static int ageOfNiece(int age1, int age2, String NieceName) {
		int total2 = age1 + age2 + Integer.parseInt(NieceName);
		System.out.println(" Total age of tree nieces is : " + total2);
		return total2;
	}

}
