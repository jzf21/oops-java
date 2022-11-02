import java.util.Arrays;
import java.util.Scanner;

class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        System.out.println(tempArray);
        char temp = tempArray[0];
        for (int i = 0; i < str.length(); i++) {
            if (temp == tempArray[i]) {
                count = count + 1;

            }
            if (temp != tempArray[i]) {
                System.out.println(tempArray[i - 1] + ":" + count);
                count = 1;
                temp = tempArray[i];
            }

        }

    }

}