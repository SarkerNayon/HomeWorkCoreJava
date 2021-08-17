/*
 * Create a package name "hw7Q3Encapsulation01" in the HW project.Inside the package.
 * a) Create a class, Employee. declare some private variable-
 * ---> Name, age, sex, usCitizen. How can you access those variables by getter and setter method? 
 *(ask) Please execute those variables and print Employee info. Paste the GitHub link below.
 */

package hw7Q3Encapsulation01;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee jhon = new Employee();
		jhon.setName("Jhon Sena");
		jhon.setAge(34);
		jhon.setSex('M');
		jhon.setUsCitizen(true);

		System.out.println("\n Name : " + jhon.getName() + "\n Age : " + jhon.getAge() + "\n Sex : " + jhon.getSex()
				+ "\n Is USA Citizen : " + jhon.isUsCitizen());

	}

}
