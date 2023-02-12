package sample.threading;

public class CountingRunnable implements Runnable {

    private Design design;
    protected boolean doStop = false;

    public CountingRunnable(Design design) {
        this.design = design;
    }

    @Override
    public void run() {
        System.out.println("Design " + design.getName() + " has " + design.getVotes().size() + " votes");        
    }
    
}
