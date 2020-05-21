import java.util.Scanner;

class aplusb{
    public static int SumOfTwoDigits(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(SumOfTwoDigits(a,b));
    }
}