import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int num = n, rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        if(rev == n)
            System.out.println("Palindrome ");
        else
            System.out.println("Not Palindrome ");
            

    }
}
