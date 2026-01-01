package IntroToMultithreading;

public class HelloWorldPrinter implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        print();
    }

    public void print(){
        System.out.println("Hello World done by this thread-> "+ Thread.currentThread().getName());
    }


}
