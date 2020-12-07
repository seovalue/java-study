package thejava.chap02;

// Bar에서는 Foo가 제공하는 기본 메소드를 제공하고 싶지 않을 때에는 추상 메소드로 선언하면 됨.
public interface Bar extends Foo {

    void printNameUpperCase();
}
