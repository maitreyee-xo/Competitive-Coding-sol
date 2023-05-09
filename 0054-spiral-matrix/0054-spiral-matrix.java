class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {        
        if(matrix.length == 0 || matrix[0].length == 0) return arr;
        int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        while(true)
        {
            for(int i = left; i <= right;i++)
                arr.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;
            for(int i = top;i <= bottom;i++) 
                arr.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;
            for(int i = right; i >= left;i--) arr.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;
            for(int i = bottom;i >= top;i--) arr.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        return arr;
    }
}