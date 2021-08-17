/*
 * 04) Now think about a regular class Iphone1. 
 * Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. 
 * what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. 
 * [Complete the code after answering above]. [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it.
 * Call all the possible method by each of them. Go to next step after finishing till this. [points: 70] .
 */

package java_oop_exam;

public class Iphone1 extends AppleWatch implements Phone {
	private int price;
	private String Info;
	private char user;
	private boolean madeInUSA;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void email() { // method 1 out of 6
		System.out.println("This is email method from super class Iphone1");
	}
	
	
	
	public void regularClassInfo() {
		System.out.println("all the features of a regular class compared with Interface and Abstract class");
		System.out.println("what is the relation between regular class, Abstract class and Interface?");
	}

	@Override
	public void interfaceInfo() {
	}

	@Override
	public void call() {
	}

	@Override
	public void camera() {
	}

	@Override
	public void massage() {
	}

	@Override
	public void battery() {
	}

	@Override
	public void wireless() {
	}

}

/*
 * what is the relation between regular class, Abstract class and Interface?
 * 
 */
