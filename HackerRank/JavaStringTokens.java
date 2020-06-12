public class JavaStringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        s =s.trim();
        if(s.length() >0){
            String delims = "[ .!,?._'@]+";

            String[] tokens = s.split(delims);
            System.out.println(tokens.length);
            for(String a:tokens)
                System.out.println(a);
        }

    }
}
