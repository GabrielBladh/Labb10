import java.util.Scanner;

public class Tandläkarklinik
{
    public static void main(String[] args)
    {
        int rabatt = 0;
        int totalBehandlingar = 0;
        int totalPris = 0;
        Scanner input = new Scanner(System.in);
        boolean x = true;
        String[][] behandlingar = {{"Kontroll","600"},{"Lagning hål","1500"},{"Rengöring","300"}};
        String[][] Kvitto = new String[10][2];
        while (x == true)
        {
            printMenu();
            int menyVal = input.nextInt();
            if (totalBehandlingar >= 10)
            {
                System.out.println("Du får max göra 10 behandlingar");
                menyVal = -1;
            }
            if (menyVal == 1)
            {
                for (int col = 0; col < behandlingar[0].length; col++)
                {
                    System.out.println(behandlingar[0][col]);
                    Kvitto[totalBehandlingar][col] = behandlingar[0][col];
                }
                totalBehandlingar++;
                totalPris += Integer.parseInt(behandlingar[0][1]);
            }
            if (menyVal == 2)
            {
                for (int col = 0; col < behandlingar[1].length; col++)
                {
                    System.out.println(behandlingar[1][col]);
                    Kvitto[totalBehandlingar][col] = behandlingar[1][col];
                }
                totalBehandlingar++;
                totalPris += Integer.parseInt(behandlingar[1][1]);
            }
            if (menyVal == 3)
            {
                for (int col = 0; col < behandlingar[2].length; col++)
                {
                    System.out.println(behandlingar[2][col]);
                    Kvitto[totalBehandlingar][col] = behandlingar[2][col];
                }
                totalBehandlingar++;
                totalPris += Integer.parseInt(behandlingar[2][1]);
            }
            if (menyVal == -1)
            {
                rabatt = totalPris/10;
                System.out.println("Kvitto: ");
                for (int row = 0; row < Kvitto.length; row++)
                {
                    for (int col = 0; col < Kvitto[row].length; col++)
                    {
                        if (Kvitto[row][col] == null)
                        {
                            continue;
                        }
                        System.out.println(Kvitto[row][col]);
                    }
                }
                System.out.println("Totala kostnaden: " + totalPris + "Kr");
                System.out.println("Rabatt: " + rabatt + "Kr");
                totalPris = totalPris - rabatt;
                System.out.println("Summa att betala: " + totalPris + "Kr");
                x = false;
            }
        }
    }

    public static void printMenu()
    {
        System.out.println("Vad vill du göra idag?");
        System.out.println("1. Kontroll");
        System.out.println("2. Laga hål");
        System.out.println("3. Rengöring");
        System.out.println("-1. skriv ut kvitto och avsluta programmet");
    }
}
