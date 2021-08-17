package hw8Q6Abstraction03;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	// abstract method only can be made in abstract class.

	public void maths() {
		System.out.println("This is math method under RockefellerUniversity Class.");

	}

	public RockefellerUniversity() {
		// Default Constructor.
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void computerLab() {
		// TODO Auto-generated method stub
		super.computerLab();
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub

	}

}
