package IntroToMultithreading;

public class Client {
    public static void main(String[] args) {

        //main thread
        System.out.println(Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        //runnable object is needed inside Thread Constructor
        //thread knows only that things which is of type runnable ie has implemented run method of runnable
        Thread thread= new Thread(helloWorldPrinter);
        thread.start();
    }
}
