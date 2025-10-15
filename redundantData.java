public class redundantData
{
    public static AutoTester autoTester;
    
    public static void main(String[] args)
    {
        int temp = 0;
        autoTester = new AutoTester();
        int sortedArray[] = {1, 5, 0, 2, 0, 6, 0, 9, 7, 4};
        int höger = 9;
        boolean containsZeros = true;
        while (containsZeros == true)
        {
            for (int row = 0; row < sortedArray.length; row++)
            {
                if (sortedArray[row] == 0)
                {
                    if (sortedArray[9] == 0 && sortedArray[8] == 0 && sortedArray[7] == 0)
                    {
                        containsZeros = false;
                    }
                    else
                    {
                        boolean högerHittad = false;
                        while (högerHittad == false)
                        {
                            if (sortedArray[höger] != 0)
                            {
                                temp = sortedArray[row];
                                sortedArray[row] = sortedArray[höger];
                                sortedArray[höger] = temp;
                                höger = höger - 1;
                                högerHittad = true;
                            }
                            else
                            {
                                höger = höger - 1;
                            }
                        }
                    }
                    //sortedArray[row] = 1; //RADERA
                }
                System.out.println(sortedArray[row]);
            }
            containsZeros = false;
        }
        autoTester.testA6(sortedArray, containsZeros);
    }
}
