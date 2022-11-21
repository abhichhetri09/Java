
import java.util.Scanner;

public class TotalPrice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter price: ");
		String price = input.nextLine();
		int firstInt = Integer.parseInt(price);
		System.out.println("Enter handling fee: ");
		String fee = input1.nextLine();
		int secInt = Integer.parseInt(fee);
		System.out.println("The total price is " + (firstInt + secInt));
	}
}