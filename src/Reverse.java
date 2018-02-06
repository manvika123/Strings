import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = input.length() - 1; i >= 0; --i){
            str += input.charAt(i);
    }
            System.out.print(str);
    }
}

