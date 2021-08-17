/*
 *(From HW 06) Copy your previous package "hw6Q4Abstraction01" and rename it to "hw7Q4Abstraction02" inside your HW project and execute the remaining. 
 *Read the question very carefully. i) Create one default and one static method gymnasium and library inside interface "University".
 *Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 *Create also one default and one static method dorm and studyRoom inside interface "College". 
 *How many keywords are used for the inheritance in Java? how many keywords are used for the inheritance in Interface, answer by Java comments? 
 *if you can use the keyword 'implements' in Interface, please use it. Use all the interfaces -- University, Hospital, and College to answer my questions.
 *ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool.
 *how many keywords are used for the inheritance in Java for Abstract Class?
 *Can an Abstract Class inherit other Abstract Class or a regular class or interface? 
 *How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes and use the keywords to answer my questions. 
 *iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity.
 *how many keywords are used for the inheritance in Java for a regular Class? 
 *Can an regular Class inherit other Abstract Class or a regular class or interface? 
 *How many inheritances is possible by a regular Class? Use the all of above regular Classes and use the keywords to answer my questions.
 *You don't need to execute anything as the main method is absent. Paste your Abstraction github link below
Your answer

 */

package hw7Q4Abstraction02;

public interface College {
	public void comonRoom();

	public void laboratory();

	public void languageClub();

	/*
	 * public College(); // default constructor created Interface can not have
	 * constructor
	 */
	public default void dorm() {

	}

	public static void studyRoom() {

	}

	/*
	 * {{{{{{{{{ Questions. }}}}}}}}}
	 * 
	 * How many keywords are used for the inheritance in Java?
	 * 
	 * 
	 * [[[[[[[[[[ Regular Class..? ]]]]]]]]] How many keywords are used for the
	 * inheritance for a regular Class? = 2 extend and implements.
	 * 
	 * Can a regular Class inherit other Abstract Class or regular class or
	 * interface? = YES, Only one abstract or regular class.
	 * 
	 * How many inheritances is possible by a regular Class? = Only one abstract or
	 * regular class and multiple Interface.
	 * 
	 * 
	 * [[[[[[[[[[ Abstract Class..? ]]]]]]]]]] How many keywords are used for the
	 * inheritance of Abstract Class ? = 2 extend and implements.
	 * 
	 * Can Abstract Class inherit other Abstract Class or a regular class or
	 * interface? = YES, Only one abstract or regular class.
	 * 
	 * How many inheritances is possible by an Abstract Class? = Only one abstract
	 * or regular class and multiple Interface.
	 * 
	 *
	 * [[[[[[[[[[ Interface..? ]]]]]]]]]] How many keywords are used for the
	 * inheritance in Interface
	 *
	 * if you can use the keyword 'implements' in Interface, please use it. Use all
	 * the interfaces -- University, Hospital, and College to answer my questions.
	 */

}
