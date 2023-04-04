import java.util.*;

class HrsException extends Exception{
    public HrsException(String s){
        super(s);
    }
    public String Hrs(){
        return "Hrs Exception \n";
    }   
}

class MinException extends Exception{
    public MinException(String s){
        super(s);
    }
    public String Min(){
        return "Min Exception \n";
    }
}

class SecException extends Exception{
    public SecException(String s){
        super(s);
    }
    public String Sec(){
        return "Sec Exception \n";
    }
}

public class Time{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hr = sc.nextInt();
        System.out.println("Enter min: ");
        int min = sc.nextInt();
        System.out.println("Enter sec: ");
        int sec = sc.nextInt();
        try{
            if(hr > 24 || hr < 0){
                throw new HrsException("Error");
            }
            else{
                System.out.println("No hours exception ");
            }
        }
        catch (HrsException h){
            System.out.println(h.Hrs());
        }

        try{
            if(min > 60 || min < 0){
                throw new MinException("Error");
            }
        }
        catch (MinException m){
            System.out.println(m.Min());
        }

        try{
            if(sec > 60 || sec < 0){
                throw new SecException("Error");
            }
        }
        catch (SecException s){
            System.out.println(s.Sec());
        }
    }
}