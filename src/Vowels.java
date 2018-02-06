import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.next();
        int count=0;

        for (int i=0; i<text.length();i++) {

            char c = text.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count++;
        }
        System.out.println(count);
    }

}
