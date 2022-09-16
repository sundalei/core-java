package sample.c308.intermediate.defaultmethods;

public class WriteTableImpl implements WriteTable1, WriteTable2 {

    @Override
    public void abc() {
        System.out.println("Override abc() of WriteTableImpl is called.");
    }

    @Override
    public void write1() {
        System.out.println("Inside overriden1 write1 of WriteTableImpl");
    }
}
