package sample.c308.intermediate.defaultmethods;

public interface WriteTable2 {

    default void write1() {
        System.out.println("Inside default write1 method of WriteTable2");
    }

    static void pqr() {
        System.out.println("Inside pqr static method of WriteTable2");
    }
}
