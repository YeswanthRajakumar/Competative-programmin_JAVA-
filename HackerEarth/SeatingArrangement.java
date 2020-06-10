package defaultp;

import java.util.Scanner;

public class SeatingArrangement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		
		
		for(int ti =0 ;ti<test_cases;ti++) {
			int key = sc.nextInt();
			int limit =12;
			int start=1;
			int x =0;
//			int key = 13;
			int range_start=0;
			int range_end=0;
			int[] range_array = new int[12];
			int array_index= 0;
			boolean break_key = false;
			char[] seattype = {'W','M','A','A','M','W','W','M','A','A','M','W'};
			for(int i=1 ;i<=9;i++){
				for(x=start;x<=limit;x++)
				{
//					System.out.print(x +" ");
					if(x==key){
						range_start = start;
						range_end = limit;
						break_key =true;
						}
				}
				if(break_key)
					break;
				
			
				start = 1+limit;
				limit = limit +12;	
			}
			
//			System.out.println("Boy in range of :"+ range_start +" - "+range_end);
		
			for(int i =range_start;i<=range_end;i++)
			{
				range_array[array_index] = i;
				array_index++;
			}
		
			
//			for(int i:range_array) {
//				System.out.print(i +" ");
//			}
//			
//			System.out.println(range_array.length);

			for(int i=0;i<12;i++)
			{
				
				if(range_array[i] == key) {
					System.out.printf("%d %cS ",range_array[(12-i) -1],seattype[(12-i) -1]);
				}		
									
			}
			
		}
		
		

			
	
	}
	
	

}
