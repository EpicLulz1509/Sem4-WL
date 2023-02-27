import java.util.*;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int d1 = 0, d2 = 0;

        System.out.println("Enter 9 nos: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int n = sc.nextInt();
                if(i == j && i == 1){
                    d1 += n;
                    d2 += n;
                }
                else if(j - i == 2 || i - j == 2)
                    d2 += n;
                else if(i == j)
                    d1 += n;
            }
        }

        System.out.println("Diagonal 1: " + d1 + " Diagonal 2: " + d2);


        sc.close();
    }    
}
