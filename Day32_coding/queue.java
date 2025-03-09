import java.util.Queue;
import  java.util.*;
public class queue
{
    public static void main(String[] args) {
        Queue<String> queue  = new LinkedList<>();

        // Enqueue  elements
        queue .add("Apple");
        queue .add("Banana");
        queue .add("Mango");

        System.out.println("Front element: " + queue .peek());
        System.out.println("queue : " + queue );

        // Dequeue  element
        queue .poll();
        System.out.println("After dequeue : " + queue );
    }
}