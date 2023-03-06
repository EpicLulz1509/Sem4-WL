class shape{
    double area;
    void showarea(){
        System.out.println("Area: " + area);
    }
}

class circle extends shape{
    int r;
    circle(){
        r = 0;
        area = 0.0;
    }
    circle(int x){
        r = x;
        area = r * r * 3.146;
    }
}

class rectangle extends shape{
    int l, b;
    rectangle(){
        l = 0;
        b = 0;
        area = 0.0;
    }
    rectangle(int x, int y){
        l = x;
        b = y;
        area = l * b;
    }
}

public class areashapes {
    public static void main(String[] args) {
        circle c1 = new circle(5);
        c1.showarea();
        rectangle r1 = new rectangle(5,7);
        r1.showarea();
    }    
}
