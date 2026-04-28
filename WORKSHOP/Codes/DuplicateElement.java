package Workshop;
import java.util.*;
public class DuplicateElement {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Original List : "+ list);
        Set<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: " + uniqueList);
    }
}

