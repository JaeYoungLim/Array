
public class CalculatorDriver {
	public static void main(String [] args) {
		//array is a group of data that has the same type
		double [] num = new double [3];
		//num[0]-num[2]
		
		num[0] = 4.0;
		num[1] = 5.0;
		num[2] = 3.0;
			
		System.out.println("Sum is " + Calculator.getSum(num));
		System.out.println("Average is " + Calculator.getAverage(num));
		System.out.println("Product is " + Calculator.getProduct(num));
		System.out.println("Factorial is " + Calculator.getFactorial(num));


	}

}
