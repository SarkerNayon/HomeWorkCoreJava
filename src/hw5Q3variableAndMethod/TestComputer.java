package hw5Q3variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer mine = new Computer();
		mine.Brand = "Apple";
		mine.Model = "MacBook Air";
		mine.OS = "MacOS Mojave";
		mine.price = 800;
		mine.madeInUSA = false;
		mine.grade = 'A';
		mine.configuration();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Computer brother = new Computer();
		brother.Brand = "Ghost S1";
		brother.Model = "Ryzen 5600x";
		brother.OS = "Windows 10";
		brother.price = 3200;
		brother.madeInUSA = true;
		brother.grade = 'A';
		brother.configuration();

	}

}
