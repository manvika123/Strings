
import java.util.Arrays;

public class Sort
{
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    // Driver method
    public static void main(String[] args)
    {
        String inputString = "ravindra";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }
}

