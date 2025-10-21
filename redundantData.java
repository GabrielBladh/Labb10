public class redundantData
{
    public static AutoTester autoTester;
    
    public static void main(String[] args)
    {
        autoTester = new AutoTester();
        int unSortedArray[] = {0, 5, 9, 8, 0, 7, 4 , 4, 6, 0};
        int sortedArray[] = new int[unSortedArray.length];
        int rowSortedArray = 0;
        boolean containsZeros = false;
        while (containsZeros == false)
        {
            for (int row = 0; row < unSortedArray.length; row++)
            {
                if (unSortedArray[row] != 0)
                {
                    sortedArray[rowSortedArray] = unSortedArray[row];
                    System.out.println(sortedArray[rowSortedArray]);
                    rowSortedArray++;
                }
            }
            containsZeros = true;
        } 
        autoTester.testA6(sortedArray, containsZeros);
    }
}
