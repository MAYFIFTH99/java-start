package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n == 3) {
                System.out.println("종료");
                return;
            }
            if (n == 1) {
                System.out.print("상품 이름: ");
                productNames[productCount] =scanner.nextLine();
                System.out.print("상품 가격: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;
            }
            if (n == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] +": "+productPrices[i]+"원");

                }
            }
        }
    }
}
