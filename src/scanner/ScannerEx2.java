package scanner;
import java.util.Scanner;


public class ScannerEx2 {
    public static void main(String[] args) {
        System.out.print("하나의 정수를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("입력한 숫자 " + num + "은 짝수입니다");
        }
        else System.out.println("입력한 숫자 " + num + "은 홀수입니다");
    }
}
