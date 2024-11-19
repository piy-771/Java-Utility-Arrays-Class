
import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] array1 = {2,5,6,9,7,2};
        int[] array2 = {2,5,6,9,7,2};
        if(Arrays.equals(array2,array1)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
