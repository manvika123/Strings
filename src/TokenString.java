import java.util.Scanner;

public class TokenString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.nextLine();
       String key= sc.next();
            int count=0;
            while(text.contains(key)){
                count++;
                text=text.substring(text.indexOf(key)+key.length());
            }
        System.out.println("The output is: "+count);
        }
    }
