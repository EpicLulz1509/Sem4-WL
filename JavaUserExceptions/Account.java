class LessBalanceException extends Exception{
    public LessBalanceException(String s){
        super(s);
    }
    public String Less(){
        return "Withdraw amound not valid \n";
    }
}

public class Account {
    int balance;
    Account(){
        balance = 500;
    }
    Account(int b){
        balance = b;
    }
    void deposit(int d){
        balance += d;
    }
    void Withdraw(int w){
        try{
            if(w > balance-500)
                throw new LessBalanceException("Error");
            else
                balance -= w;
        }
        catch(LessBalanceException l){
            System.out.println(l.Less());
        }        
    }
    public static void main(String[] args) {
        Account a = new Account(5000);
        a.Withdraw(6000);
    }
}
