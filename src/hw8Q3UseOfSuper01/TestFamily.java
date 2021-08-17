package hw8Q3UseOfSuper01;

public class TestFamily {

	public static void main(String[] args) {
		Father father = new Father();
		father.father();
		father.fatherInfo("Shombo", 50, 'M', false);

		Son son = new Son();
		son.son();
		son.sonInfo(5084, 12);

	}

}
