package thejava.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("minjeong");
        names.add("seovalue");

        names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList()); // 종료형 오퍼레이터를 사용해야 내부가 실행된다.

        System.out.println("===========================");

        names.forEach(System.out::println);

        names.parallelStream().map(String::toUpperCase)
                .collect(Collectors.toList()); //parallelStream은 병렬 스레드를 이용할 때 사용, 데이터가 방대하게 큰 경우에만 이용
    }
}
