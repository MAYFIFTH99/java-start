package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        int num;
        int balance = 0;
        System.out.println("----------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("----------------------------");


        while(true) {
            Scanner scanner = new Scanner(System.in);
            num =  scanner.nextInt();
            switch (num) {
                case (1):
                    System.out.println("선택: " + num);
                    System.out.print("입금액을 입력하세요: ");
                    int inputPrice = scanner.nextInt();
                    balance = input(balance, inputPrice);
                    System.out.println(inputPrice + "원을 입금하였습니다. 현재 잔액: " + balance);
                    continue;
                case (2):
                    System.out.println("선택: " + num);
                    System.out.print("출금액을 입력하세요: ");
                    int outputPrice  = scanner.nextInt();
                    balance = output(balance, outputPrice);
                    if (balance < 0) {
                        System.out.println("잔액 부족");
                        break;
                    }
                    System.out.println(outputPrice + "원을 출금하였습니다. 현재 잔액: " + balance);
                    continue;
                case(3):
                    System.out.println("현재 잔액: " + balance);
                    continue;
                case(4):
                    System.out.println("시스템을 종료합니다");
                    break;
            }
        }
        }

        public static int input(int balance, int inputPrice){
        balance += inputPrice;
        return balance;
    }

    public static int output(int balance, int outputPrice){
        balance -= outputPrice;
        return balance;
    }



}
