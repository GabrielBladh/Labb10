public class spelplan
{
    public static AutoTester autoTester;
    public static void main (String[] args)
    {
        autoTester = new AutoTester();
        int gameField[][] = {{1, 1, 2, 3, 3},{2, 1, 1, 2, 3},{3, 2, 2, 1, 2},{3, 3, 3, 3, 3}};
        int position = 0;
        int sumDödligPosition = 0;
        char expectedResults[][] = new char[gameField.length][gameField[0].length];
        for (int row = 0; row < gameField.length; row++)
        {
            for (int col = 0; col < gameField[row].length; col++)
            {
                sumDödligPosition = 0;
                for (int row1 = row -1; row1 <= row + 1; row1++)
                {
                    for (int col1 = col -1; col1 <= col + 1; col1++)
                    {
                        if (row1 >= 0 && row1 < gameField.length && col1 >= 0 && col1 < gameField[row].length)
                        {
                            sumDödligPosition += gameField[row1][col1];
                        }
                        else
                        {
                            continue;
                        }
                    }   
                }
                sumDödligPosition -= gameField[row][col];
                if (gameField[row][col] == 3 || sumDödligPosition >= 15)
                {
                    expectedResults[row][col] = 'F';
                }
                else
                {
                    expectedResults[row][col] = 'T';
                }
            }
        }
        autoTester.testA9(gameField, expectedResults);
    }
}
