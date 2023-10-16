class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> pascal = new ArrayList <Integer>();
        for(int i = 0; i < rowIndex + 1;i++)         
        {
            pascal.add(0,1);
            for (int j = 1; j < pascal.size() - 1; j++)
            {
			pascal.set(j, pascal.get(j) + pascal.get(j + 1));
		}
        }
        return pascal;
        }
    }