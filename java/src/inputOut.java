import java.io.BufferedReader;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by root on 6/19/17.
 */
public class inputOut {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer");
        int i = scan.nextInt();
        System.out.println("Enter a double");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter a string");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
