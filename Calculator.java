
public class Calculator {

	public static double getSum(double [] num) {
		double sum=0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return(sum);
	}
	
	public static double getAverage(double [] num) {
		double sum=0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		return (sum/num.length);
	}
	
	public static double getProduct(double [] num) {
		double product=1;
		for(int i=0; i<num.length; i++) {
			product*=num[i];
		}
		return(product);
	}

	public static double getFactorial(double [] num) {
		double factorial=1;
		for(int i=1; i<=num.length; i++) {
			factorial=1;
			for(int j=2; j<=i; j++) {
				factorial*=j;
			}
		}
		return(factorial);
		
	}
}
