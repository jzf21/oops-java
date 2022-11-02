import java.util.Scanner;
import java.util.StringTokenizer;

public class File3 {

    public static void main(String[] args) {
        System.out.println("Enter string of numbers");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer integer = new StringTokenizer(str);
        int i, sum = 0;
        while (integer.hasMoreTokens()) {
            i = Integer.parseInt(integer.nextToken());
            sum += i;
            System.out.println(i);

        }
        System.out.println("Sum is " + sum);
    }
}