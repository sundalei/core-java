package sample.chapter18;

public interface TestInterface {

    default void defMethod1() {
        sharedCode();
        System.out.println("In default method 1");
    }

    default void defMethod2() {
        sharedCode();
        System.out.println("In default method 2");
    }

    private void sharedCode() {
        System.out.println("In sharedCode, invoking it on its own"
                + " doesn't make much sense");
    }
}
