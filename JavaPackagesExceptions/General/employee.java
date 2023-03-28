package General;

public class employee {
    protected int empid;
    private String ename;
    public double basic, earnings;
    public employee(){
        empid = 0;
        ename = "";
        basic = 0.0;
    }
    public employee(int i, String n, double b){
        empid = i;
        ename = n;
        basic = b;
    }
    public void earning(){
        earnings = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Name: " + ename + " ID: " + empid);
        System.out.println("Total earnings: " + earnings);
    }
    // public static void main(String[] args){
    //     employee obj = new employee(101, "Arun", 5000);
    //     obj.earning();
    // }
}