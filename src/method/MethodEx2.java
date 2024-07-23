package method;

public class MethodEx2 {
    public static void main(String[] args) {
        printString("hello",5);
        printString("world",3);


    }
    public static void printString(String s,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
