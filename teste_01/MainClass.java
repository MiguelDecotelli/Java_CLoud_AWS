import java.util.Scanner;

/**
 * MainClass
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scan.nextLine();
        System.out.println("Hello," + name + "!");
        scan.close();
    
    
    
    }



    
}