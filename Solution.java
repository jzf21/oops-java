import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int j = 0; j < T; j++) {

            str = sc.next();
            for (int i = 0; i < str.length(); i = i + 2) {
                System.out.print(str.charAt(i));

            }
            System.out.print(str.charAt(str.length() - 1));
            System.out.println();
        }

    }

}
