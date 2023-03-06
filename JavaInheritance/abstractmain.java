abstract class student{
    int rollno, regno;
    student(){
        rollno = 0;
        regno = 0;
    }
    student(int a, int b){
        rollno = a;
        regno = b;
    }
    abstract void func();
    void disp(){
        System.out.println("Roll no: " + rollno + " Reg no: " + regno);
    }  
}

class kiitian extends student{
    String c;
    kiitian(){
        super();
        c = "";
    }
    kiitian(String a){
        super(549, 12345);
        c = a;
    }
    void course(){
        System.out.println("Course: " + c);
    }
    void func(){
        System.out.println("Roll no: " + rollno);
        System.out.println("Reg no: " + regno);
        System.out.println("Course: " + c);
    }
}

public class abstractmain {
    public static void main(String[] args) {
        kiitian obj = new kiitian("EEE");
        obj.func();
    }
}
