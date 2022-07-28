package hw4JavaVariables;

public class AboutMe {

	// variables declared
	public String name;
	public byte age;
	public short mySchoolFee;
	public int myYearlySalary;
	public long mySavings;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean single;

	// Constructor Declared
	public AboutMe() {
		// TODO Auto-generated constructor stub
		System.out.println("This is all about us: ");

	}

	// method implemented
	public void aboutMe() {
		System.out.println("My Name is: " + name + "\nMy Age: " + age + "\nMy School Rent: " + mySchoolFee
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Savings : " + mySchoolFee + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I Single : " + single);
	}

}
