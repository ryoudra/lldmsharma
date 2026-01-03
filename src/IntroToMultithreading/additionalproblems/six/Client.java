package IntroToMultithreading.additionalproblems.six;

import java.util.Scanner;
public class Client{

    public static void main(String []args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        for(int i=1;i<=n;i++){

            TableCreator tbc= new TableCreator(i);
            ScalerThread sct= new ScalerThread(tbc);
            sct.start();
        }

    }

}