import java.util.Scanner;
import java.text.DecimalFormat;

public class FormatDecimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		DecimalFormat fourDecimals = new DecimalFormat("0.0000"); 
		System.out.println("Enter a decimal number:");
		double decimal = Double.parseDouble(input.nextLine().replace(',' , '.')); 
	
		System.out.println(twoDecimals.format(decimal));
		System.out.println(fourDecimals.format(decimal));
	}

}
