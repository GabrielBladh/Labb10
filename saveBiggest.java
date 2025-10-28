public class saveBiggest
{
    public static AutoTester autoTester;

    public static void main(String[] args)
    {
        autoTester = new AutoTester();
        int datasetOne[][] = {{1,2,3},{11, 12, 13},{6, 3, 23}};
        int datasetTwo[][] = {{1,1,4},{1, 2, 3},{21, 7, 23}};
        int datasetLargest[][] = {};
        for (int row1 = 0; row1 < datasetOne.length; row1++)
        {
            if (datasetOne.length > datasetTwo.length || datasetOne[row1].length > datasetTwo[row1].length || datasetTwo.length > datasetOne.length || datasetTwo[row1].length > datasetTwo[row1].length)
            {
                System.out.println("arrayerna är inte lika stora");
            }
            datasetLargest = new int[datasetOne.length][datasetOne[row1].length]; 
        }
        for (int row2 = 0; row2 < datasetOne.length; row2++)
        {
            for (int col = 0; col < datasetOne[row2].length; col++)
            {
                if (datasetOne[row2][col] > datasetTwo[row2][col])
                {
                    System.out.println("Största talet är " + datasetOne[row2][col] + " från array 1");
                    datasetLargest[row2][col] = datasetOne[row2][col];
                }
                else if (datasetTwo[row2][col] > datasetOne[row2][col])
                {
                    System.out.println("Största talet är " + datasetTwo[row2][col] + " från array 2");
                    datasetLargest[row2][col] = datasetTwo[row2][col];
                }   
                else
                {
                    System.out.println("Talet " + datasetOne[row2][col] + " är lika stora från båda arrayerna");
                    datasetLargest[row2][col] = datasetOne[row2][col];  
                }
            } 
        }
        autoTester.testA7(datasetOne, datasetTwo, datasetLargest);
    } 
}
