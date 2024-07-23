package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum =0;
        double average;
        System.out.print("입력받을 숫자의 개수 :");
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(n+"개의 정수를 입력하세요:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        average = (double)sum /n;
        System.out.println("합: "+sum);
        System.out.println("평균: " + average);

    }
}
