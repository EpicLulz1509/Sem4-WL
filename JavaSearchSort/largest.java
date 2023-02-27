import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nos: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a > b && a > c)
            System.out.println("Largest: " + a);
        if(b > c && b > a)
            System.out.println("Largest: " + b);
        if(c > b && c > a)
            System.out.println("Largest: " + c);

        sc.close();
    }
}