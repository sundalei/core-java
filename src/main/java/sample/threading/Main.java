package sample.threading;

public class Main {
    public static void main(String[] args) {

        // for (int count = 0; count < 3; count++) {
        //     FirstThread thread = new FirstThread(count + 1);
        //     thread.start();
        // }
        

        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread = new Thread(myRunnable);
        // thread.start();

        Design d1 = new Design(1, "D1");

        VotingRunnable votingRunnableD1 = new VotingRunnable(d1);
        CountingRunnable countingRunnableD1 = new CountingRunnable(d1);

        Thread votingD1 = new Thread(votingRunnableD1);
        Thread countingD1 = new Thread(countingRunnableD1);

        votingD1.start();
        countingD1.start();

        Design d2 = new Design(2, "D2");

        VotingRunnable votingRunnableD2 = new VotingRunnable(d2);
        CountingRunnable countingRunnableD2 = new CountingRunnable(d2);

        Thread votingD2 = new Thread(votingRunnableD2);
        Thread countingD2 = new Thread(countingRunnableD2);

        votingD2.start();
        countingD2.start();

        Design d3 = new Design(3, "D3");

        VotingRunnable votingRunnableD3 = new VotingRunnable(d3);
        CountingRunnable countingRunnableD3 = new CountingRunnable(d3);

        Thread votingD3 = new Thread(votingRunnableD3);
        Thread countingD3 = new Thread(countingRunnableD3);

        votingD3.start();
        countingD3.start();
    }
}
