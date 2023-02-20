import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println("Prime ");
        else
        System.out.println("Not Prime ");

    }
}
