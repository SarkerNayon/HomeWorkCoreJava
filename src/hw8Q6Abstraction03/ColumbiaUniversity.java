package hw8Q6Abstraction03;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// public abstract void chemistry()
	// abstract method only can be made in abstract class.
	public void biology() {
		System.out.println("This is a reguler method in ColumbiaUniversity class.");

	}

	public ColumbiaUniversity() {
		// Default Constructor.
	}

	@Override
	public void anatomyLab() {
	}

	@Override
	public void vocationalInfo() {
	}

	@Override
	public void gymnasium() {
		University.super.gymnasium();
	}

	@Override
	public void classSize() {
	}

	@Override
	public void field() {
	}

	@Override
	public void teacher() {
	}

	@Override
	public void cafeteria() {
	}

	@Override
	public void laboratory() {
	}

	@Override
	public void languageClub() {
	}

	@Override
	public void hygiene() {
	}

	@Override
	public void comonRoom() {
	}

	@Override
	public void surgeryRoom() {
	}

	@Override
	public void emergencyRoom() {
	}

}
// this is after the macbook swap.