package array;

import java.beans.beancontext.BeanContextChild;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = new int[]{90, 80, 70, 60, 50};
        int sum=0;
        int count=0;
        double average;
        for (int student : students) {
            sum += student;
            count++;
        }
        average = (double)sum / count;
        System.out.println("점수 총합: "+sum);
        System.out.println("점수 평균: "+average);
    }
}
