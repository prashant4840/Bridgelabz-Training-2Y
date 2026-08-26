import java.util.*;

public class LearningArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(100);

        System.out.println("Original Array List: " + list);

        Integer[] result = list.toArray(new Integer[0]);

        System.out.println("After converting ArrayList into Array:");
        System.out.println(Arrays.toString(result));
    }
}