package Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class FileReverse {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(new File("lamb.txt"));
        Stack lineStorage = new Stack();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            lineStorage.push(line);
        }
        input.close();

        PrintWriter out = new PrintWriter("bmal.txt");
        while(!lineStorage.empty()){
            out.println(lineStorage.pop());
        }
        out.close();
    }
}

