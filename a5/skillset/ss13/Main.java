import java.util.Scanner;
class Main {
    public static void main(String args[]) {

        String fileName="myfile.txt";

        Methods.getRequirements();
        Methods.fileWrite(fileName);
        Methods.fileRead(fileName);
    }
}