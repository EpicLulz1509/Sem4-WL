interface Motor{
    int r = 0, c = 1;
    void run();
    void consume();
}

public class washingmachine implements Motor{
    public void run(){
        System.out.println("Running: " + r);
    }
    public void consume(){
        System.out.println("Consuming: " + c);
    }
    public static void main(String[] args) {
        washingmachine obj = new washingmachine();
        obj.run();
        obj.consume();
    }
}