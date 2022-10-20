import java.util.Scanner;
class StringFunction
{
    public static void main(String args[])
    {
        String str;
        int alpha=0, num=0, blank=0, special=0;
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        str = sc.nextLine();
        for(int i=0; i<str.length(); i++)
        {
            x = str.charAt(i);
            if(x>='A' && x<='Z' || x>='a' && x<='z')
            {
                alpha++;
            }
            else if(x>='0' && x<='9')
            {
                num++;
            }
            else if(x == ' ')
            {
                blank++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("No. of alphabets in the String: "+alpha);
        System.out.println("No. of numbers in the String: "+num);
        System.out.println("No. of white spaces in the String: "+blank);
        System.out.println("No. of special characters in the String: "+special);
    }
}
