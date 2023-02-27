public class Rectangle {
    int x, y, peri, area;
    Rectangle(){
        x = 0;
        y = 0;
    }
    Rectangle(int a, int b){
        x = a;
        y = b;
    }
    void calc(){
        peri = 2 * (x+y);
        area = x*y;
    }
    void display(){
        System.out.println("Perimeter: " + peri + " Area: " + area);
    }
    public static void main(String[] args) {
        Rectangle ob1 = new Rectangle(5,6);
        ob1.calc();
        ob1.display();

    }
}
