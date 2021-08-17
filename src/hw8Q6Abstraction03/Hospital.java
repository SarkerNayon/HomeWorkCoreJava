package hw8Q6Abstraction03;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	/*
	 * public Hospital(); // default constructor created Interface can not have
	 * constructor
	 */
	public default void morgue() {

	}

	public static void pharmacy() {

	}

}
