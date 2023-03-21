interface Student{
    void disp();
}

interface Marks{
    void disp();
}

interface Department extends Student, Marks{
    void disp();
}

public class extendingdemo implements Department {
    public void disp(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        extendingdemo obj = new extendingdemo();
        obj.disp();
    }
}
