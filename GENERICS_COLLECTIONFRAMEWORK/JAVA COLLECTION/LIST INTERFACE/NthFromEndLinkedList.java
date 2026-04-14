import java.util.*;

public class NthFromEndLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        int n = 2;

        int fast = 0, slow = 0;

        ListIterator<String> fastIt = list.listIterator();
        ListIterator<String> slowIt = list.listIterator();

        // move fast pointer n steps ahead
        while (fast < n && fastIt.hasNext()) {
            fastIt.next();
            fast++;
        }

        // move both until fast reaches end
        while (fastIt.hasNext()) {
            fastIt.next();
            slowIt.next();
        }

        System.out.println(n + "th element from end: " + slowIt.next());
    }
}