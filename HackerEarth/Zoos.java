package defaultp;

import java.util.Scanner;

public class Zoos {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String word  = sc.nextLine();
	        char[] arr = word.toCharArray();
	        int z_count =0;
	        int o_count=0;
	        for (char c:arr) {
	        	if(c=='z')
	        		z_count +=1;
	        	else
	        		o_count +=1;
	        }
	        
	        if (z_count*2 == o_count)
	        	System.out.println("Yes");
	        else
	        	System.out.println("No");
	        

	}

}
