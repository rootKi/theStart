import java.util.Scanner;

public class stringIntFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter stuff: ");
        String input = sc.nextLine();

        String[] stringArr = input.split("\\s+");

        System.out.println("================================");
        for(int i=0;i<2;i++){
//            String s1 = sc.next();
//            int x = sc.nextInt();

            System.out.printf("%-15s", stringArr[i]);
//            System.out.println(stringArr[i]);

        }
        System.out.println("\n================================");

    }
}