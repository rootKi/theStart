import java.util.Scanner;

public class stringIntFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter(" ");

        System.out.println("Enter stuff: ");

        System.out.println("================================");
//        for(int i=1;i<3;i++){
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.printf("%-15", s1, x);

//        }
        System.out.println("================================");

    }
}