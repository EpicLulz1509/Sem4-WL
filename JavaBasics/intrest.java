import java.util.*;

class intrest {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int p = sc.nextInt();
        System.out.print("Enter rate: ");
        int r = sc.nextInt();
        System.out.print("Enter time: ");
        int t = sc.nextInt();
        double si = p * r * t * 0.01;
        System.out.println("Simple Intrest: " + si);
    }

}