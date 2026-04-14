import java.util.*;

public class ReverseListDemo {

    public static void reverseArrayList(List<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        reverseArrayList(arrayList);

        Collections.reverse(linkedList); // allowed for linked list test

        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}