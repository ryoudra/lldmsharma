package lambdaAndStreamApis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        // create class then object
        Task1 task1 = new Task1();
        Thread  thread1 = new Thread(task1);
        thread1.start();

        //another method via lambda , no class made, no object made direct provide body
        // as it(runnable) is fi , so of that single method by default
        Runnable someOtherTask = ()->{
            System.out.println("hello from task created via lambda");
        };
        Thread  thread2 = new Thread(someOtherTask);
        thread2.start();

        System.out.println("comparator inside lambda");
        //compartor inside lambda

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //now we want even sorted number first then odd sorted number

        Comparator<Integer> comparatorEvenFirst= (o1,o2)->{
            if(o1%2==0)return -1;
            else if(o2%2==0)return 1;
            return 0;
        };

        Collections.sort(list,comparatorEvenFirst);
        System.out.println(list);
    }
}
