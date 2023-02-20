public class overload_area {
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
        area(10);
        area(1.5, 2.5);
        area(1,2);
    }
}
