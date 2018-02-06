import java.util.Arrays;
import java.util.Scanner;

public class Remove {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String s= sc.next();
            String s1= sc.next();
            char[] ss = s.toCharArray();
            char[] ss1 = s1.toCharArray();

            for(int i=0;i<ss.length;i++){
                for(int j=0;j<ss1.length;j++){
                    if(ss1[j] == ss[i]){
                        ss1[j] = 'x'; //Replace the common char with x
                    }
                }
            }
            System.out.println(Arrays.toString(ss1));
        }
    }
