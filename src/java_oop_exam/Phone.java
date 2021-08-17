package java_oop_exam;

public interface Phone {

	public abstract void interfaceInfo();

//	{
//		System.out.println("What are the features of Interface you know? \n Interface is  blueprint of the class, \n No constructor only (Declared) methods");
//		System.out.println("Can we create a constructor inside an interface? \\n Answer is NO");
//		System.out.println("Can we write variables inside Interface? \n Answer is NO");
//		
//	}

	public abstract void call();
//	{
//		System.out.println("Do you think we can extends or implements Interface? \n Answer : Only intrface can extends interface and Reguler & Abstract cass can implement interface.");
//	}

	public abstract void camera();
//	{
//		System.out.println("Only intrface can extends multiple interface.\n");
//	}

	public abstract void massage();
//	{
//		System.out.println("Reguler & Abstract cass can implement multiple interface.\n");
//	}

	public void battery();
//	{
//		System.out.println("This is non abstract method battery from Phone class.\n");
//	}

	public void wireless();
//	{
//		System.out.println("This is non abstract method wireless from Phone class.\n");
//	}

}
