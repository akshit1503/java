import java.util.Queue;
import java.util.LinkedList;

public class FIFO {

    public static void main(String[] args) {
     // Queue is a FIFO data structure: first-in, first-out.
     Queue<String> queue = new LinkedList<String>();

     // Add/enqueue elements
     queue.add("one");
     queue.offer("two");
     queue.add("three");

     System.out.println("Queue after additions: " + queue);

     // Remove/dequeue elements
     String removed1 = queue.remove(); // throws if empty
     String removed2 = queue.poll();   // returns null if empty

     System.out.println("Removed1: " + removed1);
     System.out.println("Removed2: " + removed2);
     System.out.println("Queue now: " + queue);
    }

}