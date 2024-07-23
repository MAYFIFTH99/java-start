package scanner;
import java.util.Scanner;
public class ScannerEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalPrice=0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("상품명을 입력하세요:");
                    String name = scanner.nextLine();
                    System.out.println("상품의 가격을 입력하세요:");
                    int price = scanner.nextInt();
                    System.out.println("구매 수량을 입력하세요");
                    int count = scanner.nextInt();
                    totalPrice += (count*price);

                    break;

            }
        }
    }
}
