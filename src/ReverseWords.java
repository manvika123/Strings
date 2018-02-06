import java.util.Scanner;

public class ReverseWords {
    public static void reverseWords(String words){
            if(words.length() == 0 || words == null){
                return;
            }
            String[] array = words.split(" ");
            for(int i=array.length - 1;i>=0;i--){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            reverseWords("I love raudra and ravindra");
        }

    }
