import java.util.*;

public class RotateList {

    public static void rotate(List<Integer> list, int k) {

        int n = list.size();
        k = k % n;

        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    private static void reverse(List<Integer> list, int i, int j) {

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        rotate(list, 2);

        System.out.println(list);
    }
}