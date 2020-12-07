package thejava.chap02;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("minjeong");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}
