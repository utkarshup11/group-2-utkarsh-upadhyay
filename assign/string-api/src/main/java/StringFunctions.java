
// class use to reverse the string and find the length of the string .
public class StringFunctions
{
    String revString="";

    // method to calculate the length of the string
    public int getLengthString(String str)
    {
        int lengthOfString = str.length();
        return lengthOfString;
    }

    // method to reverse the string
    public String revereString(String str)
    {

            for(int reverseCounter = str.length()-1 ; reverseCounter >= 0 ; reverseCounter--)
            {
                revString = revString + Character.toString(str.charAt(reverseCounter));
            }

        return revString;
    }


}
