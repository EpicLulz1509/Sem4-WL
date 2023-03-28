class xyz {
    void show() throws Exception {
        System.out.println("Exception of super class");
    }
}

class abc extends xyz {
    void show() throws RuntimeException {
        System.out.println("Exception of sub class");
    }

}

public class exception2 {
    public static void main(String args[]) throws Exception {
        xyz a = new abc();
        a.show();
    }
}