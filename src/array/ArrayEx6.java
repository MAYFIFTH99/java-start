package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max, min;
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        n = scanner.nextInt();
        System.out.println(n+"개의 정수를 입력하세요:");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("가장 작은 정수: " + arr[0]);
        System.out.println("가장 큰 정수: " + arr[n-1]);

        }
    }

