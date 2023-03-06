class plate{
    int l, b;
    plate(){
        l = 0;
        b = 0;
    }
    plate(int a, int b){
        l = a;
        this.b = b;
    }
}

class box extends plate{
    int w;
    box(){
        l = 0;
        b = 0;
        w = 0;
    }
    box(int x, int y, int z){
        l = x;
        b = y;
        w = z;
    }
}

public class woodbox extends box{
    int t;
    woodbox(){
        l = 0;
        b = 0;
        w = 0;
        t = 0;
    }
    woodbox(int x, int y, int z, int u){
        l = x;
        b = y;
        w = z;
        t = u;
    }
    void display(){
        System.out.println("Length: " + l + " Breadth: " + b + " Width: " + w + " Thickness: " + t);
    }
    public static void main(String[] args) {
        woodbox obj = new woodbox(1,2,3,4);
        obj.display();
        
    }    
}
