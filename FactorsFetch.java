package practiseCoding;
import java.util.ArrayList;

class FactorsFetch {
    public static int kthFactor(int n, int k) {
        for(int x = 1, count = 0; x <= n; x++)
            if(n % x == 0 && ++count == k) return x;
        return -1;
    }

    public static void main(String[] args) {
        int n =9;
        int k = 2;
        System.out.println(kthFactor(n ,k));
    }
}



