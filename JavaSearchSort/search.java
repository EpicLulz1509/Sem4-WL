import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter nos: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }        

        for(int i = 0; i < n; i++){
            int num = arr[i], c1 = 0, c2 = 0;
            for(int j = 0; j < n ; j++){
                if(num == arr[j]){
                    c1++;
                    if(j < i)
                        c2++;
                }
                
            }
            if(c2 == 0)
                System.out.println(num + " : " + c1);

        }

        sc.close();
    }
}
