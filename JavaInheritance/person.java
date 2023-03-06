class account{
    int acc_no, balance;
    account(){
        acc_no = 0;
        balance = 0;
    }
    account(int x, int y){
        acc_no = x;
        balance = y;
    }
    void disp(){
        System.out.println("Account no: " + acc_no + " Balance: " + balance);
    }
}

public class person extends account {
    String name;
    int aadhar_no;
    person(String n, int a, int b, int c){
        acc_no = b;
        balance = c;
        name = n;
        aadhar_no = a;
    }
    void disp(){
        System.out.println("Name: " + name + " Aadhar no: " + aadhar_no);
        System.out.println("Account no: " + acc_no + " Balance: " + balance);
    }
    public static void main(String[] args) {
        person p1 = new person("Arun", 213, 456, 5000);
        p1.disp();
    }
}
