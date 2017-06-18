/**
 * Created by root on 6/16/17.
 */
public class balance {

    public static void main(String[] args) {

        String symbols = "{[]()";

        System.out.println(balanceThatShit(symbols));
    }

    public static String balanceThatShit(String stuff) {
        String ans = "";
        char[] chars = stuff.toCharArray();

        if (chars.length % 2 != 0) {
            return "Shits Weak Bitch!!!";
        }

        for (int i = 0; i <= chars.length-1; i++) {
            if (chars[i] == '{' && chars[i+1] != '}') {
                System.out.println(chars[i]);
                ans = "Shits Weak";
                break;
            }
            if (chars[i] == '[' && chars[i+1] != ']') {
                ans = "Shits Weak";
                break;
            }
            if (chars[i] == '(' && chars[i+1] != ')') {
                ans = "Shits Weak";
                break;
            }
            else {
                ans = "Winner";
            }
        }
        return ans;
    }
}
