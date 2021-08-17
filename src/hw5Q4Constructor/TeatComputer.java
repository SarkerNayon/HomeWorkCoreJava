package hw5Q4Constructor;

public class TeatComputer {

	/*
	 * System.out.println("My Brand : " + Brand + "Operating System : " + OS +
	 * "Price : " + "Grade : " + grade+ price + "Grade : " + grade +
	 * "is made in USA :" + madeInUSA );
	 */

	public static void main(String[] args) {

		Computer test = new Computer();
		Computer test1 = new Computer("Apple", "MacBook Air", "MacOS  Mojave", 800, 'C', false);
		Computer test2 = new Computer("Apple", "MacBook Air M1", "MacOS BigSur", 750, 'A', true);
		Computer test3 = new Computer("Lenovo");
		Computer test4 = new Computer("HP", "Omen", 999);
		Computer test5 = new Computer("Dell", "XPS 13", "Windows 10", 1299, 'A');

	}

}
