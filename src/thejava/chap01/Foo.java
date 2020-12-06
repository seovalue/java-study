package thejava.chap01;

public class Foo {

    public static void main(String[] args){
        // 익명 내부 클래스
        RunSomething runSomething = () -> System.out.println("hi");
    }
}
