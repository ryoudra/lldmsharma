package IntroToMultithreading.assignment.first;

public class Client {
    public static void main(String[]args){
        System.out.println("I am the main class");

        Adder adder= new Adder();
        ScalerThread sct= new ScalerThread(adder);
        sct.start();

        Subtractor subtractor= new Subtractor();
        ScalerThread sct2= new ScalerThread(subtractor);
        sct2.start();
    }



}
