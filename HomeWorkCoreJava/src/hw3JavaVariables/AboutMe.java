package hw3JavaVariables;

public class AboutMe {

	// variable declared
	public String my_name;

	// variable initialized
	public String name = "Tanvir Ahmed";
	public byte age = 28;
	public short myApartmentRent = 2500;
	public int myYearlySalary = 999999999; // Highest value for int type variable
	public long myBankBalance = 6374365687965847658l; // l at the end for making it long value
	public float myHeight = 5.7f; // f at the end for float value
	public double myGrade = 3.23;
	public boolean usCitizen = false;
	public char sex = 'M';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name : " + aboutMe.name + "\nMy Age : " + aboutMe.age);

	}

}