import java.util.Scanner;

// THIS IS JUST A TEST FILE FOR ME TO PLAY WITH AND UNDERSTAND THE LOGIC BEHIND THE 
// JAVA SCANNER CLASS


public class ScannerTest {

    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);


    }
    
}
