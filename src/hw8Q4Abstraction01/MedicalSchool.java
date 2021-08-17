package hw8Q4Abstraction01;

public abstract class MedicalSchool {

	public MedicalSchool() {
		// default constructor.
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from non abstract class biochemistryLab.");
	}

}
