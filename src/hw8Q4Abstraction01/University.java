/*
 * ii) You have 2 abstract class name --MedicalSchool, EngineeringSchool already. Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not?
 * 
 iii) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if any of them is not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? 
 
 iv) Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? 
 
 v) Create a regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? 
 
 You don't need to execute anything as the main method is absent. Organize the code. Push the code in Github. Paste your github link below.
 */

package hw8Q4Abstraction01;

public interface University extends College, Hospital {
	public void classSize();

	public void field();

	public void teacher();

	/*
	 * public University(); // default constructor created Interface can not have
	 * constructor
	 */

}

/*
 * Questions.
 * 
 * How many keywords are used for the inheritance for Interface? Ans = 2, extend
 * and implement.
 * 
 * Can an interface inherit other Interface or a regular class or abstract
 * class? Ans = yes. How many inheritance is possible? Ans = More than 1.
 * 
 * 
 * How many keywords are used for the inheritance of Abstract Class ? Ans = 2
 * extend and implements.
 * 
 * Can Abstract Class inherit other Abstract Class or a regular class or
 * interface? Ans = YES, Only one abstract or regular class.
 * 
 * 3:- How many inheritances is possible by an Abstract Class? = Only one
 * abstract or regular class and multiple Interface.
 * 
 * 4:- how many keywords are used for the inheritance for a regular Class? = 2
 * extend and implements.
 * 
 * 5:-Can a regular Class inherit other Abstract Class or regular class or
 * interface? = YES, Only one abstract or regular class.
 * 
 * 6:- How many inheritances is possible by a regular Class? = Only one abstract
 * or regular class and multiple Interface.
 */
