/*
 *  Create a package name "hw8Q3UseOfSuper01" in the HW project. Inside the package,
 *  a) Create a class name Father.
 *  declare some variable like Name, age, sex, usCitizen, FamilyName.
 *  Declare default and parameterized constructor from the first 4 variables. 
 *  Use FamilyName variable for use by super keyword. 
 *  Create a regular void method father() which is implemented, declare a sysout. 
 *  Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout 
 *  b) Create a class name Son, declare variable Id, grade. 
 *  Declare default and parameterized constructor, and implement a regular method son and declare a sysout. 
 *  Create a parameterized method sonInfo() which contains 2 of its variables. 
 *  Son extends Father (super class). 
 *  Use super method, super keyword and show all of their use in child class.
 *  and initialize in a TestFamily Class. Paste GitHub link below.
 */

package hw8Q3UseOfSuper01;

public class Father {

	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	public Father() {
		// Default Constructor
	}

	public Father(String Name, int age, char sex, boolean usCitizen) {
		// parameterized Constructor.

	}
	// father();

	public void father() {
		// Regular void method.
		System.out.println("This is from void father method.\n");
	}

	public void fatherInfo(String Name, int age, char sex, boolean usCitizen) {
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father's name : " + Name + "\n His age : " + age + "\n His Gander is : " + sex
				+ "\n Is he a usCitixen : " + usCitizen);
	}

}
