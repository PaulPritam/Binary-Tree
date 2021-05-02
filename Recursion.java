import java.util.Scanner;

public class Recursion {
    public static void repeatThis(int n) {
        if(n==0)
        {
            System.out.println("Done Repeating");
        }
        else
        {
            System.out.println("Repeat " +n);
            n--;
            repeatThis(n);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        repeatThis(data);
    }
}
