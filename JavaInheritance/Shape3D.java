class Shape2D {
    int x, y;
    Shape2D(){
        x = 0;
        y = 0;
    }
    Shape2D(int a, int b){
        x = a;
        y = b;
    }
    void display(){
        System.out.println("Total cost: " + x*y*40);
    }
}    

public class Shape3D extends Shape2D{
    int z;
    Shape3D(){
        x = 0;
        y = 0;
        z = 0;
    }
    Shape3D(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }
    void display(){
        System.out.println("Total cost: " + x*y*z*60);
    }
    public static void main(String[] args) {
        Shape3D obj = new Shape3D(1,2,3);
        obj.display();
    }
}
