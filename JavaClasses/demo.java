import java.util.*;

class box{
    int l, w, h;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter length: ");
        l = sc.nextInt();
        System.out.println("Enter width: ");
        w = sc.nextInt();
        System.out.println("Enter height: ");
        h = sc.nextInt();    
    }

    void volume(){
        int v = l * w * h;
        System.out.println("Volume: " + v);
    }  
}


public class demo {
    public static void main(String[] args) {
        box b1 = new box();
        b1.input();
        b1.volume();
    }    
}

