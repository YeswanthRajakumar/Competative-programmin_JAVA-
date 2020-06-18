import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n = sc.nextLine();
        BigInteger b  = new BigInteger(n);
        BigInteger i  = new BigInteger("1");
        if(b.compareTo(i) > 0)
        {
            if(b.isProbablePrime(0))
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
        else
            System.out.println("not prime");
    }
}
