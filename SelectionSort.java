public class SelectionSort
{
    public static AutoTester autoTester;

    public static void main (String[] args)
    {
        autoTester = new AutoTester();
        int minstaNummer = 0;
        int temp = 0;
        int indexFörMinsta = 0;
        int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        autoTester.prepareSortedArrays(array);
        for (int i = 0; i < array.length; i++)
        {
            minstaNummer = array[i];
            for (int row = i; row < array.length; row++)
            {
                if (array[row] <= minstaNummer)
                {
                    minstaNummer = array[row];
                    indexFörMinsta = row;
                }
            }
            temp = array[i];
            array[i] = minstaNummer;
            array[indexFörMinsta] = temp;
            autoTester.testA8(array, i);
        }
    }
}
