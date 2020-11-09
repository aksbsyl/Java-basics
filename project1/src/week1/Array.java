package week1;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       //int[]  numbers= new int[5];
       //numbers[0] =1;
       //numbers[1]=1;
        int[] numbers = {2,3,5,1,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
