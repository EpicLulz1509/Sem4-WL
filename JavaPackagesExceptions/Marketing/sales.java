package Marketing;
import General.*;
public class sales extends employee{
    public sales(){
        super();
    }
    public sales(int i, String n, double b){
        super(i, n, b);
    }
    void tallowance(){
        super.earning();
        double tall = earnings * 0.05;
        System.out.println("Travel allowance: " + tall);
    }
}
