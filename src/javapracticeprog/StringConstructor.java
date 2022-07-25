package javapracticeprog;

public class StringConstructor {

	public static void main(String[] args) {
		String s3 = "deepak"; // 1 object
        String s4 = new String("deepak"); // 2 object

        System.out.println(s3);
        System.out.println(s4.length());

        StringBuffer s5 = new StringBuffer("hitesh");
        String s6 = new String(s5);
        System.out.println(s5);

        StringBuilder s7 = new StringBuilder("mukesh");
        String s8 = new String(s7);
        System.out.println(s8);

        char[] s1 = new char[]{'a','b','c'}; // store string as a password
        String s2 = new String("abc");
        System.out.println("s1:- " + s1);
        System.out.println("s1:- " + s2);
        
        char ch[] = {'g','e','e','k','y'};
        String st = new String(ch);
        System.out.println(st);
        
        byte b[] = {101, 102, 103};
        String st2 = new String(b);
        System.out.println(st2);
    }



	}


