import java.util.Arrays;

public class ArraysCopyOfRange {
    public static void main(String[] args) {
        int[] array = {1,5,6,9,8,1,5};
        int[] newArray = Arrays.copyOfRange(array,0,4);
        for(int i : newArray){
            System.out.println(i + "\t");
        }
    }
}
