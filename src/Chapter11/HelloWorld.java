package Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) throws FileNotFoundException {

            // Creating a PrintWriter object to write to the file
            PrintWriter out = new PrintWriter("hello.txt");
            out.println("Hello, World!");
            out.close();

            // Scanning in the file to my scanner object
            Scanner in = new Scanner(new File("hello.txt"));
            while (in.hasNextLine()) {
                String input = in.nextLine();
                System.out.println(input);
            }
            in.close();
    }
}
