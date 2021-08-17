package hw9Q3Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.ageOfSister(10);
		sister.ageOfSister(10, 20, 30);
		sister.ageOfSister(10, 20, 30, 40);
		sister.ageOfSister(10, 20, 30, "50");

		Niece nice = new Niece();
		nice.ageOfSister(5);
		nice.ageOfSister(5, 10, 15);
		nice.ageOfSister(5, 10, 15, 20);
		nice.ageOfSister(5, 10, 15, "100");
		nice.ageOfNiece(5, 10);

	}
}
