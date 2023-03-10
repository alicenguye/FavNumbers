import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        int favInteger= SafeInput.getInt(in, "Enter your favorite integer number");
        double favDouble= SafeInput.getInt(in, "Enter your favorite double number");
        System.out.println("favorite integer number: "+ favInteger);
        System.out.println("favorite double number: "+ favDouble);
    }
}