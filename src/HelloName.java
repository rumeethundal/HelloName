import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner greeting = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = greeting.nextLine();
        System.out.print("Hello " + name);

    }




}
