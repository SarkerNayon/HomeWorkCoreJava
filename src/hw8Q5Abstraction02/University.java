package hw8Q5Abstraction02;

public interface University extends College, Hospital {
	public void classSize();

	public void field();

	public void teacher();

	/*
	 * public University(); // default constructor created Interface can not have
	 * constructor
	 */
	public default void gymnasium() {

	}

	public static void libary() {

	}

}
