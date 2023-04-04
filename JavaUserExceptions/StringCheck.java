public class StringCheck {
    public static void main(String[] args) {
        String s = new String("Hello World");
        String s1 = s.toLowerCase();
        System.out.println("Lower case: " + s1);
        String s2 = s.toUpperCase();
        System.out.println("Upper case: " + s2);
        String s3 = "";
        for(int i = s.length()-1; i >= 0; i--){
            s3 += s.charAt(i);
        }
        System.out.println(s3);
        System.out.println(s3.compareTo(s));
        String s4 = "How are you";
        s = s4;
        System.out.println(s);


    }
}
