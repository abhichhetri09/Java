import java.util.Scanner;
public class CourseCredits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter credits: ");
		String credit = input.nextLine();
		
		System.out.println("Enter course name: ");
		String course = input1.nextLine();
	
		System.out.println((course + " (" + credit + "cr" + ")"));
	}
}