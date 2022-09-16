package sample.c308.intermediate.defaultmethods;

@FunctionalInterface
public interface WriteTable1 {

    abstract void abc();

    default void write1() {
        System.out.println("Inside default write1 method of WriteTable1");
    }

    default void write2() {
        System.out.println("Inside default write2 method of WriteTable1");
    }

    static void pqr() {
        System.out.println("Inside pqr static method of WriteTable1");
    }
}
