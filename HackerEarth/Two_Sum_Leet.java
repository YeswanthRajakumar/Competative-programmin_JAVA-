public class Two_Sum_Leet
{
    public static void main(String[] args) {

        int[] arr = {3,2,4};
        int[] f = new int[2];
        int t = 6;
        boolean key = false;
        for(int i=0;i<arr.length;i++)
        {
            if( key ==false) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                        if ((arr[i] + arr[j]) == t) {
                            f[0] = i;
                            System.out.println(arr[i] +" in pos "+i);
                            f[1] = j;
                            System.out.println(arr[j]+" in pos "+j);
                            key = true;
                        }
                    }
                } }
        }
}
}
