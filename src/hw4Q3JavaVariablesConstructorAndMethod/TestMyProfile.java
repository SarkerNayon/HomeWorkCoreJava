package hw4Q3JavaVariablesConstructorAndMethod;

public class TestMyProfile {

	public static void main(String[] args) {
		// This is my Main method to test my code.
		
		MyProfile nayon = new MyProfile();
		nayon.name = "Nayon Sarker";
		nayon.age = 27;
		nayon.sex='M';
		nayon.workExperince =3;
		nayon.yearlyTax=120000l;
		nayon.houseRent=36000f;
		nayon.gpa=3.65f;
		nayon.height=5.9;
		nayon.myProfile();
		System.out.println("--------------------------------------------------------------------\n");
		
		MyProfile elon = new MyProfile();
		elon.name="Elon Mask";
		elon.age = 50;
		elon.sex='M';
		elon.workExperince=35;
		elon.yearlyTax=9999999l;
		elon.houseRent=99999f;
		elon.gpa=4;
		elon.height=6.2;
		elon.myProfile();
		System.out.println("--------------------------------------------------------------------\n");
		

	}

}
