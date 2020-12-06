package thejava.chap01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

//        UnaryOperator<String> hi = (s) -> "hi " + s;, 아래와 동일
        UnaryOperator<String> hi = Greeting::hi;
        System.out.println(hi.apply("minjeong"));

        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        Function<String, Greeting> minjeongGreeting
                = Greeting::new;
        Greeting minjeong = minjeongGreeting.apply("minjeong");
        System.out.println(minjeong.getName());

        String[] names = {"minjeong", "tobi", "seovalue"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (o1, o2) -> {return o2.compareTo(o1);});
        System.out.println(Arrays.toString(names));
    }
}
