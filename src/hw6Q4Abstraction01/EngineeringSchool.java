package hw6Q4Abstraction01;

//
public abstract class EngineeringSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is from non Abstract method computerLab.");
	}

	public EngineeringSchool() {
		// default constructor.
	}
}
