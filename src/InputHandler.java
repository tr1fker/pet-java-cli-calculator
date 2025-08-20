import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    public int inputInteger(){
        return scanner.nextInt();
    }

    public char inputOperator(){
        return scanner.next().charAt(0);
    }

}
