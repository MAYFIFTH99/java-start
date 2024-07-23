package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] students = new int[4][3];
        String subjects[] = new String[]{"국어", "수학", "영어"};

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            System.out.println(i + 1 + " 학생의 성적을 입력하세요:");
            double average;
            for (int j = 0; j < students[0].length; j++) {
                System.out.println(subjects[j] + "점수: ");
                students[i][j] = scanner.nextInt();
                total += students[i][j];

            }
            average = total / (double)4;
            System.out.println(i + 1 + "번 학생의 총점 : " + total + ", 평균: " + average);

        }
    }
}
