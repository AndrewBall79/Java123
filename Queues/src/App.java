import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        q1.add(10);
        q1.add(6);
        q1.add(8);

        try {
            q1.add(90);
        }catch(IllegalStateException e){
            System.out.println("Too many items");
        }
        for(Integer value : q1){
            System.out.println("Queue value : " + value);
        }

        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());

        try {
        System.out.println("Removed from queue: " + q1.remove());

        }catch(IllegalStateException e){
            System.out.println("Tried to remove too many items");
        }


        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("Queue 2 peek : " + q2.peek());



        q2.offer(10);
        q2.offer(6);
        if( q2.offer(8) == false){
            System.out.println("Offer failed to add third item");
        }
        for (Integer value: q2){
            System.out.println("Queue 2 value: " + value);
        }

        System.out.println("Queue 2 poss: " + q2.poll() );
    }
}
