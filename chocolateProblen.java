package practiseCoding;
import java.util.Arrays;

public class chocolateProblen {

    static int chocdist(int [] arr, int m, int n)
    {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i + m - 1 < n;i++)
        {
            int dif = arr[i+m-1] - arr[i];
            if( dif < min)
            {
                min = arr[i+m-1] - arr[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {

        int [] arr = {12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
                50};
        int m = 9;
        int n = arr.length;
        System.out.println(chocdist(arr,m,n));
    }
}
