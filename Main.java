/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Worlds");
    }
    public static boolean isPrime(int number)
    {   
        if(number <= 1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(number); i++)
        {
            if (number %i == 0)
            {
                return false; // a divisor is found
            }
        }
        return true; // no divisorsfound
    }

    public static void special(int x) throws Exception
    {
        if(x == 2023)
        {
            throw new NullPointerException();
        } else 
        {
            System.out.println(x);;
        }
    }
}