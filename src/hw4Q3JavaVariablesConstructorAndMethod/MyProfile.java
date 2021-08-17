/*
 (03) Create --- a package name "hw4Q3JavaVariablesConstructorAndMethod" in "HomeWorkCoreJavaJune2021" project.
 Create a Class name "MyProfile". Declare 8 types (If less than 8 type, will get zero) of primitive variable and initialize them
  by object under main method. Declare default constructor and initialize it (show by comments where it is initializing).
  Use a method and add above declared varible to use to get a outcome in console. Print out 2 sets of data for different 
  person (one is you, another one is your favorite person). Type as much as possible. Use \n, \t somewhere in the String.
  After finish writing the code, paste the code here. 
 */

package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {
	public String name;
	public int age;
	public char sex;
	public byte workExperince;
	public float houseRent;
	public long yearlyTax;
	public float gpa;
	public double height;

	public MyProfile() {// Default constructor declared
		System.out.println("This is my default consttructor");
	}

	public void myProfile() { // Method implemented
		System.out.println(
				"My name is :" + name + "\n I am " + age + "\n My gender is " + sex + "\n My work expirence of "
						+ workExperince + " years\n " + " My yearly tax is " + yearlyTax + "\n My yearly House rent is "
						+ houseRent + "\n My current GPA is " + gpa + "\n My total height is " + height);
	}

}
