package hw5Q5Constructo;

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {
		System.out.println("This is a default constructorm of Student Class.");
	}

	public Student(String StName, int stID, char sex, boolean programmer, float grade) {
		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;

		System.out.println("Student Name :" + StName + "\n Student ID : " + stID + "\n Student Sex : " + sex
				+ "\n Java Programmer" + programmer + "\n Grade :" + grade);
	}

}
