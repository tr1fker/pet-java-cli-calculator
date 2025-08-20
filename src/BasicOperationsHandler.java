public class BasicOperationsHandler {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        if (b == 0){
            System.out.println("Ошибка: Деление на ноль! Результат будет равен 1-ому числу.");
            return a;
        }
        return a / b;
    }

}
