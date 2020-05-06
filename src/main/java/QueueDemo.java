import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {


    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ira");
        queue.add("Andrei");
        queue.add("Tatiana");
        queue.add("Natalia");
        queue.add("nicolai");
        System.out.println(queue.peek());
        System.out.println(queue.offer("Catalin"));
        System.out.println(queue);


    }
}
