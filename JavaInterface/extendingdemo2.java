interface Perm{
    void disp();
}

interface Comb{
    void disp();
}

interface NPRnNCR extends Perm, Comb{
    void disp();
}

public class extendingdemo2  implements NPRnNCR{
    public void disp(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        extendingdemo2 obj = new extendingdemo2();
        obj.disp();
    }
    
}
