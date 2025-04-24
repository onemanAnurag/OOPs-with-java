import java.util.*;
public class Queueprac {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.offer(2);
        System.out.print(qu);

        System.out.println(qu.peek());
        System.out.println(qu.element());
        System.out.println(qu.remove());
        System.out.println(qu.poll());
        System.out.println(qu.poll());

    }
}
