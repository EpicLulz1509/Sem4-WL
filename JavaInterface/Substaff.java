import java.util.*;

interface Calculate{
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Calculate{
    double basic, earn, deduct, bon;
    Manager(){
        basic = 0.0;
    }
    Manager(float x){
        basic = x;
    }
    public void earnings(){
        earn = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Earnings: " + earn);
    }
    public void deductions(){
        deduct = basic * 0.12;
        System.out.println("Deductions: " + deduct);
    }
    public void bonus(){}
}

public class Substaff extends Manager{
    Substaff(){
        basic = 0;
    }
    Substaff(float x){
        basic = x;
    }
    public void bonus(){
        bon = basic * 0.5;
        System.out.println("Bonus: " + bon);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        float basic = sc.nextFloat();
        Substaff obj = new Substaff(basic);
        obj.earnings();
        obj.deductions();
        obj.bonus();
    }
}
