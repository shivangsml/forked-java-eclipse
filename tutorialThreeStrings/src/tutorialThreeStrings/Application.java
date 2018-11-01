package tutorialThreeStrings;

public class Application {

	public static void main(String[] args) {
		String someString = "What's up";
		String blank = ", ";
		String name = "Felix";
		int myInt = 8;
		String greeting = someString + blank + name;
		
		System.out.println(greeting);
		System.out.println("My int is " + myInt);
	}
}
