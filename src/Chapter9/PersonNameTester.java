package Chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonNameTester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the names of ten people: ");

        ArrayList<PersonName> nameList = new ArrayList<PersonName>();

        for(int x = 0; x < 10; x++) {
            String inputName = in.next();
            nameList.add(new PersonName(inputName));
        }
        PersonName first = nameList.get(0);
        PersonName last = nameList.get(9);

        for(int p = 1; p < 9; p++) {
            if(first.compareTo(nameList.get(p)) > 0) {
                first = nameList.get(p);
            }

            if(last.compareTo(nameList.get(p)) < 0) {
                last = nameList.get(p);
            }
        }
        System.out.println("First: " + first.getName() + "\n Last: " + last.getName());

    }

}
