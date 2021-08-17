package hw8Q3UseOfSuper01;

public class Son extends Father {

	public int id;
	public int grade;

	public Son() {
		// Default Constructor
	}

	public Son(int id, int grade) {
		// parameterized Constructor.
		super();
		super.FamilyName = "Sarker";
	}

	public void son() {
		System.out.println("This is from void son method.\n");
	}

	public void sonInfo(int id, int grade) {
		super.Name = "Nayon";
		super.age = 27;
		this.id = id;
		this.grade = grade;
		System.out.println("Son's name : " + Name + "\n His age : " + age + "\n His id : " + id + "\n and hr is in "
				+ grade + "th Grade");
	}
}
