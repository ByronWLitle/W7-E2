import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class W7_E2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String fileName = "grades.csv";
        ReadCSV(fileName);
    }
    public static void ReadCSV(String fileName) throws FileNotFoundException
    {
            Scanner myScanner = new Scanner(new File(fileName));
            while (myScanner.hasNextLine())
            {
                String data = myScanner.nextLine();
                System.out.println(data);
            }
            myScanner.close();
    }
}
