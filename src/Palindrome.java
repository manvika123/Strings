import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.next();

        for(int i=0, j=text.length()-1;i<=j;i++,j--){
            if(text.charAt(i)!=text.charAt(j)){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("It is Palindrome");
    }
}
