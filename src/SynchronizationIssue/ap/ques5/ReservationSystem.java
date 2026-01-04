package SynchronizationIssue.ap.ques5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {
    private final Map<String,Integer> availableSeats;
    private final Map<String, Lock> seatTypeLocks;

    public ReservationSystem(Map<String, Integer> availableSeats) {
        this.availableSeats = new HashMap<>(availableSeats);
        this.seatTypeLocks = new HashMap<>();
        for (String seatType : availableSeats.keySet()) {
            seatTypeLocks.put(seatType, new ReentrantLock());
        }
    }

    // TODO: Complete the reserveSeats() method
    //Do not remove the try-catch block. You must write your code inside it
    // The method will be called concurrently by multiple people trying to book multiple seats at same time
    public boolean reserveSeats(String seatType, int numSeats) {
        //TODO : acquire the lock
        seatTypeLocks.get(seatType).lock();//IMPORTANT- though we are reading the data but still lock is necessary
        //before reading as it is the shared data , if after reading you are ready to subtract but context switch happens
        //and someone deducts the amount so less amount available now and you subtract then -ve value will be present
        try {
            //TODO: try to book required seats of the provided seat type inside the try block
            int v= availableSeats.get(seatType);
            if(v>= numSeats){
                availableSeats.put(seatType, v-numSeats);
                return true;
            }
            return false; // Not enough seats available
        } finally {
            //TODO : release the lock in finally block as this will always execute
            seatTypeLocks.get(seatType).unlock();
        }
    }

    public int getAvailableSeats(String seatType) {
        return availableSeats.get(seatType);
    }

}