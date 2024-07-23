package scanner;
import java.util.Scanner;
public class ScannerEx8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum=0;
        int count=0;
        while (true) {
            int num = input.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
            System.out.println(num);

        }
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+sum/(double)count);


    }

}
