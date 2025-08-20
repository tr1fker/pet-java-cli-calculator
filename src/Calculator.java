public class Calculator {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();

        BasicOperationsHandler basicOperationsHandler = new BasicOperationsHandler();

        System.out.print("Введите 1-ое число:");
        double a = inputHandler.inputDouble();
        System.out.print("Ведите 2-ое число:");
        double b = inputHandler.inputDouble();
        System.out.print("Введите арифетический оператор('+','-','*','/'):");
        char operator = inputHandler.inputOperator();

        double result = 0;
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