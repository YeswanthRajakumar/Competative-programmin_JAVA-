public class JavaAnagrams {
    public static void main(String[] args)
    {
        String a ="anagram";
        String b= "margana";
        if(a.length() != b.length()) {
            System.out.println("Not Anagrams");
        }
        else {
            int c[] = new int[26], d[] = new int[26];
            a = a.toUpperCase();
            b = b.toUpperCase();
            for (int i = 0; i < a.length(); i++) {
                c[a.charAt(i) - 'A']++;
                d[b.charAt(i) - 'A']++;
            }
            for (int i = 0; i < 26; i++) {
                if (c[i] != d[i]) {
                    System.out.println("Not Anagrams--");

                    break;
                }
                System.out.println("Anagrams");
                break;
            }
        }
    }
}
