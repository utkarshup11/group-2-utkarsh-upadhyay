public class Application
{
    public static void main(String[] args)
    {
        String str ="This is the first String ";
        StringFunctions sf = new StringFunctions();
        System.out.println("Length of the String - "+sf.getLengthString(str));
        System.out.println("**************************************************");
        System.out.println("After reversing the string - "+sf.revereString(str));

    }
}
