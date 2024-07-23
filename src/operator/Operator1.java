package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a=5;
        int b=2;

        // 덧셈
        int sum = a+b;
        System.out.println("a + b = "+sum); //

        int diff = a-b;
        System.out.println("a -b = "+diff);

        //  나눗셈
        int div = a/b; //-> 2.5 로 나오지 않음. int형으로 선언하였기 때문
        System.out.println("a / b = "+ sum);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = "+ mod);


    }
}
