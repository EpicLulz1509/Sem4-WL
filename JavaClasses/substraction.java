public class substraction {

    static void sub(){
        System.out.println("0");
    }

    static void sub(int x){
        System.out.println(--x);
    }

    static void sub(int x, int y){
        System.out.println(y-x);
    }

    public static void main(String[] args) {
        sub();
        sub(10);
        sub(1,2);
    }
}
