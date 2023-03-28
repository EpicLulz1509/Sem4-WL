package Biodata;

interface Schooling{
    void disp();
}

interface College{
    void disp();
}

interface Test extends Schooling, College{
    void disp();
}

public class Student implements Test {
    public void disp(){
        System.out.println("Display");
    }
    // public static void main(String[] args) {
    //     Student obj = new Student();
    //     obj.disp();
    // }
}
