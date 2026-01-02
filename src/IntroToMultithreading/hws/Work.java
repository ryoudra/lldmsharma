package IntroToMultithreading.hws;

public class Work implements Runnable {

    private  static int counter=1;

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println(counter++);
    }
}
