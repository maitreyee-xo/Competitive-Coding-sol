package practiseCoding;

import java.util.Arrays;

public class BuyAndSellStock {
//    public int sellbuy(int [] prices)

//        int min = 0,max = 0;
//        prices[0] = min;
//        for(int i = 0; i < prices.length;i++)
//        {
//                if(prices[i] < min)
//                {
//                    min = prices[i];
//                }
//        }
//        for(int j = min;j < prices.length;j++)
//        {
//            if(prices[j] > max)
//            {
//                prices[j] = max;
//            }
//        }
//        int diff = max - min;
//        if(diff > 0)
//        {
//            return diff;
//        }
//        else{
//            return 0;
//        }


    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int  min = prices[0];
        int max = prices[0];
        for(int i = 0; i < prices.length;i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
        }

            int index = Arrays.binarySearch(prices, min);

            int x = (index < 0) ? -1 : index;
            int max_index = Arrays.binarySearch(prices,max);
        System.out.println(min);
        System.out.println(x+2);
        System.out.println(max_index+7);
        for(int j = x+2;j < prices.length;j++)
        {
            if(prices[j] > max)
            {
                if(j > (max_index+7))
                {
                max = prices[j];
            }
                else
                {
                    max = 0;
                }
            }
        }
        System.out.println(max);
        int diff = max - min;
        if(diff > 0)
        {
            System.out.println(diff);
        }
        else{
            System.out.println("0 diff");
        }
        }

}
