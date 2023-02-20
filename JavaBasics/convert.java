import java.util.*;

class convert {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius: ");
        double c = sc.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.println("Celsius: " + c);
        System.out.println("Farenheit: " + f);
    }

}