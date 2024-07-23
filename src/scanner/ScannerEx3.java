package scanner;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름 :");
        String food = scanner.nextLine();

        System.out.print("음식 가격 :");
        int price = scanner.nextInt();

        System.out.print("음식 수량 :");
        int count = scanner.nextInt();

        System.out.println("피자 "+count+"개를 주문하셨습니다." +
                "총 가격은 "+price*count+"원입니다.");
    }
}
