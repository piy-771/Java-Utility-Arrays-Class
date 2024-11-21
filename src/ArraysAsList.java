import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        int[] array = {3,2,5,6,8};
        List list = Arrays.asList(array);
        System.out.println("list = " + list);
    }
}
