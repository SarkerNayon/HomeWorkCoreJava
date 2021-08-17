package hw7Q4Abstraction02;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from non abstract class biochemistryLab.");
	}

	public MedicalSchool() {
		// default constructor.
	}

}
