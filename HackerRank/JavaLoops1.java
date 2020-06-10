package defualt;

import java.util.Scanner;

public class JavaLoops1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		int i;
		for(i =1 ;i<=10;i++)
			System.out.printf("%d x %d = %d\n",input_num,i,input_num*i);
			

	}

}
