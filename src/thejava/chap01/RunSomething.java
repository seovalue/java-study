package thejava.chap01;

@FunctionalInterface
public interface RunSomething {

    abstract void doIt();

    static void printName() {
        System.out.println("Minjeong");
    }

    default void printAge() {
        System.out.println("20");
    }
}
