package thejava.chap01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class Foo {

    public static void main(String[] args) {
        // 익명 내부 클래스
        RunSomething runSomething = () -> System.out.println("hi");

        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10InterfaceExample = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10InterfaceExample.apply(1));

        Function<Integer, Integer> multiply2AndPlus10 = plus10InterfaceExample
                .compose(multiply2); // 10을 더하기 전에 2를 곱하겠다.
        System.out.println(multiply2AndPlus10.apply(1));

        Function<Integer, Integer> plus10andMultiply2 = plus10InterfaceExample.andThen(multiply2);
        System.out.println(plus10andMultiply2.apply(1));

        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int baseNumber = 10; //effective final인 경우에는 참조 가능

        // 로컬 클래스
        class LocalClass {

            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        };

        IntConsumer printInt = (i) -> {
            System.out.println(i);
        };

        printInt.accept(baseNumber);
    }
}
