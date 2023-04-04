import java.util.*;

class CheckArgumentException extends Exception{
    public CheckArgumentException(String s){
        super(s);
    }
    public String CountLess(){
        return "Too less \n";
    }
    public String CountMore(){
        return "Too more \n";
    }
}

public class Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of integers to input: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();
        }
        try {
            if(n < 4)
                throw new CheckArgumentException("Error");    
            else if(n > 4)
                throw new CheckArgumentException("Error");
            else{
                int sum = 0;
                for(int i = 0; i < n; i++)
                    sum += arr[i] * arr[i];
                System.out.println(sum);
            }    
                
        } 
        catch (CheckArgumentException c) {
            if(n < 4)
                System.out.println(c.CountLess());
            else if(n > 4)
                System.out.println(c.CountMore());
        }
        
    }
}

