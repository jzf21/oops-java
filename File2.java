import java.io.*;
import java.util.*;

public class File2 {
    static Scanner sc = new Scanner(System.in);

    public static void createrFile(String filename) {
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {

                System.out.println("File created" + myObj);
            }
        } catch (IOException e) {
            System.out.println("Help");
        }
    }

    public static void appendFile(String filename) {

        try {
            FileWriter writer = new FileWriter(filename, true);

            System.out.println("Enter String");
            String str = sc.nextLine();
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            System.out.println("Nooo");
        }
    }

    public static void writeToFile(String filename) {
        try {
            FileWriter writer = new FileWriter("filename.txt");

            System.out.println("Enter String");
            String str = sc.nextLine();
            writer.write(str);
            writer.close();
        } catch (IOException e) {

            System.out.println("Error has occurred");
        }

    }

    public static void readFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("NOOOOOo");
        }
    }

    public static void main(String[] args) {

        System.out.println("Create File(Enter File Name)");

        String filename = sc.nextLine();
        createrFile(filename);

        appendFile(filename);
        readFile(filename);

    }

}
