package lambdaAndStreamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaAndStreamClient {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //FILTER used here
        List<Integer> evenElements= list.stream().filter(
                (e)->{
                    if(e%2==0)
                    return true;

                    return false;
                }
        ).collect(Collectors.toList());

        System.out.println(evenElements);

        //MAP

        List<Integer> sqOfNumbers= list.stream().map(
                (e)->{
                    return e*e;
                }
        ).collect(Collectors.toList());
        System.out.println(sqOfNumbers);
    }
}
