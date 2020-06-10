package defualt;

import java.util.Scanner;

public class Ifelse {
	
	public static void showWeirdorNotWeird(int n) {
		if(n%2!=0) System.out.println( "Weird");
		else if (n%2 ==0 &&(n>=2 &&n<=5))System.out.println( "Not Weird");
		else if (n%2 ==0 &&(n>=6 &&n<=20))System.out.println( "Weird");
		else if (n%2 ==0 && n>20)System.out.println("Not Weird");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_number = sc.nextInt();
		showWeirdorNotWeird(input_number);
		
		
	}

}
