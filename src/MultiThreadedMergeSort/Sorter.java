package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

  private List<Integer> arrayToBeSorted;
  private ExecutorService executors;
  public Sorter(List<Integer> arrayToBeSorted, ExecutorService executors) {
      this.arrayToBeSorted = arrayToBeSorted;
      this.executors = executors;
  }



    @Override
    public List<Integer> call() throws Exception {
        System.out.println("sorting is happening in "+ Thread.currentThread().getName());
        System.out.println("Array is: " + arrayToBeSorted);

        //LOGIC

        if(arrayToBeSorted.size()<=1){
            return arrayToBeSorted;
        }

        int size=arrayToBeSorted.size();
        int mid= size/2;

        List<Integer> leftArrayToBeSorted = arrayToBeSorted.subList(0, mid);
        List<Integer> rightArrayToBeSorted = arrayToBeSorted.subList(mid, size);

        // sort the 2 parts
        Sorter leftArraySorterTask = new Sorter(leftArrayToBeSorted,executors);
        Sorter rightAarraySorterTask = new Sorter(rightArrayToBeSorted,executors);

        // take help of 2 thread for 2 parts to sort them
       // ExecutorService executorService= Executors.newFixedThreadPool(2);

        //now we using the same thread pool from client
        Future<List<Integer>> leftFuture= executors.submit(leftArraySorterTask);
        Future<List<Integer>> rightFuture= executors.submit(rightAarraySorterTask);

        //now we have to wait and get the result after all things done so for that .get()
        List<Integer> left= leftFuture.get();
        List<Integer> right= rightFuture.get();

        //now we have to merge
        //merge sort logic

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Compare and merge
        while (i < left.size() && j < right.size()) {

            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Copy remaining elements
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;

    }
}
