package javapracticeprog;

public class PowerResult {

	public static void main(String[] args) {
		
		int base = 4;
		int exponent = 4;
		
		/*int result = 1;
		 
		while (exponent != 0) {
			result*=base;
			--exponent;
			
		}
		
		System.out.println("The Result is:" +result);*/
		
		
		// 2nd way
		System.out.println("The Result is:" 
			 +Math.pow(base, exponent));
	}
         
}
