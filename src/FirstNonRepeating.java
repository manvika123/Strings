import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] input = str.toCharArray();
        boolean status = true;
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            status = true;
            for (int j = i+1; j < str.length(); j++) {
                    if (input[i] == input[j]) {
                        status = false;
                        break;
                    }
                }
                if (status == true) {
                    index = i;
                    break;
                }
            }
            if (status) {
                System.out.println(input[index]);
            }
        }
    }
