package thejava.chap01;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args){
        // 익명 내부 클래스
        RunSomething runSomething = () -> System.out.println("hi");

        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10InterfaceExample = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10InterfaceExample.apply(1));

        Function<Integer, Integer> multiply2AndPlus10 = plus10InterfaceExample.compose(multiply2); // 10을 더하기 전에 2를 곱하겠다.
        System.out.println(multiply2AndPlus10.apply(1));

        Function<Integer, Integer> plus10andMultiply2 = plus10InterfaceExample.andThen(multiply2);
        System.out.println(plus10andMultiply2.apply(1));
    }
}
