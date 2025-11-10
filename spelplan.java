public class spelplan
{
    public static AutoTester autoTester;

    public static void main (String[] args)
    {
        autoTester = new AutoTester();
        int gameField[][] = {{1, 1, 2, 3, 3},{2, 1, 1, 2, 3},{3, 2, 2, 1, 2},{3, 3, 3, 3, 3}};
        int position = 0;
        int dödligPosition = 0;
        String expectedResults[][] = {};
        for (int row = 0; row < gameField.length; row++)
        {
            for (int col = 0; col < gameField[row].length; col++)
            {
                System.out.println(gameField[row][col]);  
                position = gameField[row][col];
                for (int row1 = -1; row1 < 2; row1++)
                {
                    for (int col1 = -1; col1 < 2; col1++)
                    {
                        dödligPosition = 
                    }
                }
                if (gameField[row][col] == 3)
                {

                }
            }
            System.out.println();
        }
    }
}
