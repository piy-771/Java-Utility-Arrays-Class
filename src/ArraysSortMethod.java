import java.util.Arrays;

public class ArraysSortMethod {
    public static void main(String[] args) {
        int[] array = {5,6,1,2,5,6};
        Arrays.sort(array);
        for(int i : array){
            System.out.print(i +"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
