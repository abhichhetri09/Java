import java.util.Scanner;

public class HelloProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Greeting Word: ");
		String greeting = input.nextLine();
		System.out.println("Enter last name: ");
		String lastname = input1.nextLine();
		System.out.println("Enter first name: ");
		String firstname = input2.nextLine();
		System.out.println(greeting + " " + firstname + " " + lastname + "!");
	}
}