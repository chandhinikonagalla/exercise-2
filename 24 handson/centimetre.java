import java.util.Scanner;
public class InchtoCentimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		double centimeters, rate;
		rate = 2.54;
		Scanner s = new Scanner(System.in);
				System.out.println("Enter the Inches");
				inches = s.nextInt();
				centimeters = rate * inches;
				System.out.println("Number of centimeters "+centimeters);
		

	}

}
 