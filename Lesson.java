package aSimpleInterest;
import java.util.Scanner;
public class Lesson {

	public static void main(String[] args) {//Interest  = (principal * rate) / time
		Scanner input = new Scanner(System.in);
		int time=0;
		double interest= 0.0, rate= 0.0, principle = 0.0;
	
		System.out.println("Please enter the amount of money that you wish to invest: ");
		principle = input.nextInt();
		
		System.out.println("Please enter the rate of interest your investment will recieve:");//**Entered as a full number*/
		rate = input.nextInt();
		
		System.out.println("Please enter the amount of time you wish to invest for: ");
		time = input.nextInt();
	
		
		System.out.println("The interest earned is: " + (principle*rate)/time);
	}

}
