package IntroToMultithreading.assignment.first;

public class Adder implements Runnable{

    public void print(){
        System.out.println("I am the Adder class");
    }

    @Override
    public void run() {
        print();
    }

}
