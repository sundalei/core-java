package sample.threading;

public class VotingRunnable implements Runnable {

    private Design design;
    protected boolean doStop = false;

    public VotingRunnable(Design design) {
        this.design = design;
    }

    @Override
    public void run() {
        System.out.println("Voting going on for design " + design.getName());
        design.getVotes().add(1L);        
    }
    
}
