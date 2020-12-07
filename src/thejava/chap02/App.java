package thejava.chap02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("minjeong");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
        System.out.println();
        //////////////////////////

        List<String> name = new ArrayList<>();
        name.add("minjeong");
        name.add("seovalue");
        name.add("test1");
        name.add("test2");

        name.forEach(System.out::println);
        name.spliterator(); //쪼갤 수 있는 기능을 가진 이터레이터, 순서가 중요하지 않을 때.

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit(); // 반으로 쪼개진다.
        while (spliterator.tryAdvance(System.out::println)) {
            ;
        }
        System.out.println("===================");
        while (spliterator1.tryAdvance(System.out::println)) {
            ;
        }

        // stream
        long k = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("S"))
                .count();
        System.out.println(k);

        name.removeIf(s -> s.startsWith("t"));
        name.forEach(System.out::println);

        name.sort(String::compareToIgnoreCase); //정렬
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed()); // 역순 정렬

    }

}
