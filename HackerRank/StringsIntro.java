package defualt;

import java.util.Scanner;

public class StringsIntro {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String A = "vuut";
		String B = "vuuuuu";
		System.out.println(A.length() + B.length());
		char temp;
		char[] A_arr = A.toCharArray();
		char[] B_arr = B.toCharArray();

		for (int i = 0; i < A_arr.length; i++) {
			for (int j = i + 1; j < A_arr.length; j++) {
				if (A_arr[i] > A_arr[j]) {
					temp = A_arr[i];
					A_arr[i] = A_arr[j];
					A_arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < B_arr.length; i++) {
			for (int j = i + 1; j < B_arr.length; j++) {
				if (B_arr[i] > B_arr[j]) {
					temp = B_arr[i];
					B_arr[i] = B_arr[j];
					B_arr[j] = temp;
				}
			}
		}
		
		String lexo_order_A = A_arr.toString();
		String lexo_order_B = B_arr.toString();
		
		if(lexo_order_A.compareTo(lexo_order_B) < 0){
			System.out.println("Yes  " +lexo_order_A.compareTo(lexo_order_B));
		}
		else {
			System.out.println("No  "+lexo_order_A.compareTo(lexo_order_B));
		}
		

		System.out.println( A.substring(0,1).toUpperCase() + A.substring(1)+" "+ B.substring(0,1).toUpperCase() + B.substring(1));

		
		
		

	}

}
