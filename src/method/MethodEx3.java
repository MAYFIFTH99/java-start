package method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10;
        balance = deposit(balance, 20);
        balance = withDraw(balance, 20);
        System.out.println(balance);
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        return balance;
    }
    public static int withDraw(int balance, int withdrawAmount) {
        balance -= withdrawAmount;
        return balance;
    }
}
