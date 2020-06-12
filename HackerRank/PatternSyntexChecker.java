import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntexChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i <tc ; i++) {
            String pattern_string = sc.nextLine();
           try{
               Pattern p = Pattern.compile(pattern_string);
               System.out.println("Valid");
           }
           catch (Exception e){
               System.out.println("Invalid");
           }
           }
        }
    }

