import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 10, c1 = 0, c2 = 0;
        System.out.println("Enter 10 nos: ");
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a % 2 == 0) 
                c1++;
            else
                c2++;
        }

        System.out.println("Even : " + c1 + "\nOdd : " + c2);
        sc.close();
    }
}
