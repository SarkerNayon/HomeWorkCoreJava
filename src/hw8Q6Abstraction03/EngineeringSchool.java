package hw8Q6Abstraction03;

//
public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is from non Abstract method computerLab.");
	}

	public EngineeringSchool() {
		// default constructor.
	}
}
