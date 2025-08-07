package aInstructions;

public class Demo {

	public static void main(String[] args) {
		int input = 3;
		
		int  finalResult = summation(input);
		
		System.out.print(finalResult);
	}
	public static int summation(int n) {
		int result = (n * (n + 1)) / 2;
		
		return result;
	}
	
}
