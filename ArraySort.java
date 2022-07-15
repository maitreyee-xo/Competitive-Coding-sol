package practiseCoding;
import java.util.*;
class ArraySort {
    public void sortColors(int [] arr) {
        Arrays.sort(arr);
        for(int x : arr)
        {
        System.out.println(x);
    }
}

    public static void main(String[] args) {
        int [] arr = {2,4,5,6,6,6,5,4,43,2,2};
        Arrays.sort(arr);
        for(int x : arr)
        {
            System.out.print(x + ", ");
    }
}}