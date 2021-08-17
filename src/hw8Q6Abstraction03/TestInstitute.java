package hw8Q6Abstraction03;

public class TestInstitute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColumbiaUniversity columbia = new ColumbiaUniversity();
		columbia.aeronauticalInfo();
		columbia.anatomyLab();
		columbia.biology(); // from class ColumbiaUniversity
		columbia.biochemistryLab();
		columbia.cafeteria();
		columbia.caring();
		columbia.classSize();
		columbia.comonRoom();
		columbia.computerLab();
		columbia.dorm();
		columbia.emergencyRoom();
		columbia.field();
		columbia.gymnasium();
		columbia.hygiene();
		columbia.laboratory();
		columbia.languageClub();
		columbia.maths();
		columbia.mechanicalLab();
		columbia.physics();
		columbia.surgeryRoom();
		columbia.teacher();
		columbia.vocationalInfo();

		RockefellerUniversity rock = new RockefellerUniversity();
		rock.aeronauticalInfo(); // from interface AeronauticalSchool
		rock.mechanicalLab(); // from abstract class EngineeringSchool
		rock.computerLab(); // from abstract class EngineeringSchool
		rock.maths(); // from RockefellerUniversity class
		rock.physics(); // from class NYUniversity

		University university = new University() {

			@Override
			public void surgeryRoom() {
			}

			@Override
			public void emergencyRoom() {
			}

			@Override
			public void cafeteria() {
			}

			@Override
			public void languageClub() {
			}

			@Override
			public void laboratory() {
			}

			@Override
			public void comonRoom() {
			}

			@Override
			public void teacher() {
			}

			@Override
			public void field() {
			}

			@Override
			public void classSize() {
			}
		};

		Hospital hospital = new Hospital() {

			@Override
			public void surgeryRoom() {
			}

			@Override
			public void emergencyRoom() {
			}

			@Override
			public void cafeteria() {
			}
		};

		MedicalSchool medSchool = new MedicalSchool() {

			@Override
			public void aeronauticalInfo() {
			}

			@Override
			public void mechanicalLab() {
			}

			@Override
			public void hygiene() {
			}

			@Override
			public void anatomyLab() {
			}
		};

		NursingSchool nSchool = new NursingSchool() {

			@Override
			public void aeronauticalInfo() {
			}

			@Override
			public void mechanicalLab() {
			}

			@Override
			public void hygiene() {
			}
		};

	}

}
