import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class Methods {
    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("Program writes to and reads from same file.");
        System.out.println("Write separate lines of text to text file name 'myfile.txt'.");
        System.out.println("Include appropriate try/catch blocks.");
    }


    public static void fileWrite(String myFile)
    {
        System.out.println("Writing hard-coded text to file.");
        try {
            FileWriter fileWriter = new FileWriter(myFile);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Fourscore and seven years ago our father brought forth, ");
            bufferedWriter.newLine();
            bufferedWriter.write("on this continent, a new nation, conceived in liberty,");
            bufferedWriter.newLine();
            bufferedWriter.write("and dedicated to the proposition that all men are created equal,");

            bufferedWriter.close();
        }
        catch(IOException e) {
            System.out.println("Error writing to file " + myFile + "");
        }
    }

    public static void fileRead(String yourFile) {
        System.out.println("Reading from file.");

        String line = null;

        try {
            FileReader fileReader = new FileReader(yourFile);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
        }
        bufferedReader.close();
    }
        catch(FileNotFoundException e) {
            System.out.println("Unable to open file " + yourFile + "");
        }
        catch(IOException ex) {
            System.out.println("Error reading file " + yourFile + "");
        }
    }
}
