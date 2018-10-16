package thread;

public class Th04 {
    public static void main(String[] args) {
        Account00 ac = new Account00(10000);
        System.out.println("目前餘額是: " + ac.CheckingAccount() );
        WithDraw00 s1 = new WithDraw00(ac, 5000);
        WithDraw00 s2 = new WithDraw00(ac, 2000);
        WithDraw00 s3 = new WithDraw00(ac, 4000);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Account00 {
    private double balance;
    Account00(double b) {
        this.balance = b;
    }

    synchronized double WithDraw(double amount) { 
        double CurrentBalabce = balance;
        while (true) {
        	//synchronized(this){
            if (CurrentBalabce < amount) {
                System.out.println("本次提領金額是: "+amount);
                System.out.println("餘額不足, 無法提款");
            } else {
                System.out.println("本次提領金額是: "+amount);
            	CurrentBalabce -= amount;
            }                
            balance = CurrentBalabce;
            return balance;
       // }
        }
    }

    double CheckingAccount() {
        return balance;
    }
}

class WithDraw00 implements Runnable {
    Account00 ac;
    double m;
    WithDraw00(Account00 a, double d) {
        ac = a; 
        m = d; 
    }
    public void run() {
    	//synchronized(this){
        ac.WithDraw(m);
        System.out.println("帳戶餘款為: " + ac.CheckingAccount());
    //}
    }
}
