import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        print.ln("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.close();
        print.ln("Two times that number is: ");
        print.ln(2*x);
        // adding a comment to see if this will show up in GitHub

    }
}
