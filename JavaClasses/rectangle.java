import java.util.*;
public class rectangle {
    static int l, b, area, per; 

    static void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        l = sc.nextInt();
        System.out.println("Enter breadth: ");
        b = sc.nextInt();
        sc.close();
    }

    static void calculate(){
        area = l * b;
        per = 2 * (l + b);
    }

    static void display(){
        System.out.println("Perimeter: " + per);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        read();
        calculate();
        display();
    }

}
