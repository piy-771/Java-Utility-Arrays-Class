import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int[] array = {5,6,9,8,1,2};
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i : newArray) {
            System.out.print(i + "\t");

        }
    }
}
