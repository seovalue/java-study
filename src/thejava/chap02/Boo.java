package thejava.chap02;

public interface Boo {

    default void printNameUpperCase() {
        System.out.println("BAR");
    }
}
