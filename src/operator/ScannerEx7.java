package operator;
import java.util.Scanner;
public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격 : (-1 종료)");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("구매 수량 :");
            int count = scanner.nextInt();

            System.out.println("총 비용: "+price*count);
        }
    }
}
