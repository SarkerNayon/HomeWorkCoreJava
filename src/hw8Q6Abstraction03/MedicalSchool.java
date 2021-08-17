package hw8Q6Abstraction03;

public abstract class MedicalSchool extends NursingSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from non abstract class biochemistryLab.");
	}

	public MedicalSchool() {
		// default constructor.
	}

}
