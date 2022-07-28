package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor Initialized
		AboutMe info1 = new AboutMe();

		// Variables initialized
		info1.name = "Tanvir Ahmed";
		info1.age = 28;
		info1.mySchoolFee = 4400;
		info1.myYearlySalary = 40000;
		info1.mySavings = 200;
		info1.myHeight = 5.7f;
		info1.myGrade = 3.33;
		info1.sex = 'M';
		info1.single = true;

		// method initialized
		info1.aboutMe();

		System.out.println("\n---------------------------------------\n");
		AboutMe info2 = new AboutMe();

		// Variables initialized
		info2.name = "Alex";
		info2.age = 28;
		info2.mySchoolFee = 4400;
		info2.myYearlySalary = 120000;
		info2.mySavings = 100000;
		info2.myHeight = 5.6f;
		info2.myGrade = 3.97568346;
		info2.sex = 'M';
		info2.single = false;

		// method initialized
		info2.aboutMe();

	}

}
