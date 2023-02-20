import java.util.*;

public class menu_area {
    static double area;

    static void area(int x){
        area = x * x; 
        System.out.println("Square area: " + area);
    }
    
    static void area(int x, double y){
        area = y * x * x; 
        System.out.println("Circle area: " + area);
    }

    static void area(double x, double y){
        area = 0.5 * x * y;
        System.out.println("Triangle area: " + area);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter 0 for circle, 1 for square, 2 for triangle");
        x = sc.nextInt();
        if(x == 0){
            System.out.println("Enter radius: ");
            int r = sc.nextInt();
            area(r, 3.146);
        }
        else if(x == 1){
            System.out.println("Enter side: ");
            int s = sc.nextInt();
            area(s);
        }
        else if(x == 2){
            System.out.println("Enter length: ");
            int l = sc.nextInt();
            System.out.println("Enter breadth: ");
            int b = sc.nextInt();
            area(l,b);
        }
        else{
            System.out.println("INVALID");
        }
    }
}
