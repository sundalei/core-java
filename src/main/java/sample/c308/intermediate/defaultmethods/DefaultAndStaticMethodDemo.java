package sample.c308.intermediate.defaultmethods;

public class DefaultAndStaticMethodDemo {

    public static void main(String[] args) {
        WriteTableImpl w1 = new WriteTableImpl();
        w1.abc();
        w1.write1();
        w1.write2();
        WriteTable1.pqr();
        WriteTable2.pqr();
    }
}
