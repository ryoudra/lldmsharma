package IntroToMultithreading.hws;

public class Client {
    public static void main(String[] args) {

        Work work= new Work();


        for(int i=1;i<=100;i++) {


            Thread thread = new Thread(work);
            thread.start();

        }
    }
}
