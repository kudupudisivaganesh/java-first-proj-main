package javapracticeprog;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		int num = 1225;
		int rev = 0;
		
		int actualnum = num;
		
		while(num !=0)
		{
			int n = num%10;
			rev = rev*10+n;
			num = num/10;
						
		}
		System.out.println(rev);
		
		if(actualnum == rev) {
			
			System.out.println(actualnum + "is a pallindrome");
		}
			
		else {
			System.out.println(actualnum + "is a not a pallindrome");
		}
		}
	}



