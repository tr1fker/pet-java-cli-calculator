public class Calculator {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();

        BasicOperationsHandler basicOperationsHandler = new BasicOperationsHandler();

        System.out.print("Введите 1-ое число:");
        int a = inputHandler.inputInteger();
        System.out.print("Ведите 2-ое число:");
        int b = inputHandler.inputInteger();
        System.out.print("Введите арифетический оператор('+','-','*','/'):");
        char operator = inputHandler.inputOperator();

        int result = 0;
        switch (operator) {
            case '+':
                result = basicOperationsHandler.add(a, b);
                break;
            case '-':
                result = basicOperationsHandler.subtract(a, b);
                break;
            case '*':
                result = basicOperationsHandler.multiply(a, b);
                break;
            case '/':
                result = basicOperationsHandler.divide(a, b);
                break;
        }

        outputHandler.outputResult(result);

    }
}