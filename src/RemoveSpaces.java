import java.util.Scanner;

public class RemoveSpaces
{
    public static void main(String args[])
    {
        String str, strWithoutSpace;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Sentence : ");
        str = scan.nextLine();

        /*1. Using replaceAll() Method

        strWithoutSpace = str.replaceAll(" ", "");

        System.out.println(strWithoutSpace); */

        //2. Without Using replaceAll() Method

        char[] Array = str.toCharArray();

        StringBuffer sb = new StringBuffer();

        for (i = 0; i < Array.length; i++)
        {
            if( (Array[i] != ' ') && (Array[i] != '\t') )
            {
                sb.append(Array[i]);
            }
        }

        System.out.println(sb);
    }
}