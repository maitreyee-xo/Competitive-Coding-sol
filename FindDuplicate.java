package practiseCoding;
import java.util.Arrays;
class FindDuplicate {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++)
        {

            if(arr[i] == arr[i+1])
            {
                return arr[i];

            }
        }
        return 0;
    }
}