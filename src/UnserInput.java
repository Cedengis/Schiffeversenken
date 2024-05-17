import java.util.Scanner;

public class UnserInput {
    // Parameter
    private Scanner scanner;

    // Constructor
    public UnserInput(){
        scanner = new Scanner(System.in);
    }

    // Methods
    public char getCharInput(String prompt){
        System.out.print(prompt);
        String input = scanner.next().toLowerCase();
        while (input.length() != 1){
            System.out.println("Invalid input. Please enter a single character.");
            System.out.print(prompt);
            input = scanner.next();
        }
        return input.charAt(0);
    }

    public int getInstInput(String prompt){
        System.out.print(prompt);
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
