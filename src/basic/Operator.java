package basic;

public class Operator {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        boolean result;

        result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
        System.out.println("num1: "+num1+" num2: "+num2 + " result: " + result);
        // 실행 결과: num1: 10 num2: 0 result: false
    }
}
