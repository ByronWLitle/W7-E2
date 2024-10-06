import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class W7_E2
{
    public static void main(String[] args) throws FileNotFoundException //This throw statement will give the "error" over to the class that calls it to handle
    {
        String fileName = "grades.csv"; //String variable fileName gives the CSV file name and extension
        ReadCSV(fileName); //Calls ReadCSV method with the parameter of fileName
    }
    public static void ReadCSV(String fileName) //ReadCSV uses the parameter file's name/path to allow for reading
    {
        //Try-catch statement that will make sure file is there; if not then prints out an error message
        try
        {    
        Scanner myScanner = new Scanner(new File(fileName)); //Scanner class called to read file name/path and get all data from it
            while (myScanner.hasNextLine()) //While-loop keeps going as long as there is data on next line
            {
                String data = myScanner.nextLine(); //String data variable gets all data from line
                System.out.println(data); //Prints out what data variable got
            }
            myScanner.close(); //Closes scanner to avoid resource link (according to debug console; warning error)
        }
        catch (FileNotFoundException e) //If file is not found, it prints out error message
        {
            System.out.println("An error has occured."); //Prints error message
            e.printStackTrace(); //Shows what happened that led to error 
        }
    }
}
