package HomeWork2.Task2;


public class Program {

    private int number1;
    private int number2;

    public int division(int number1, int number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return number1 / number2;

    }
}
