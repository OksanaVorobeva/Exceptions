package HW.Task3;


public class Program {
    private int number1;
    private int number2;
    private int number3;


    public void division(int number1, int number2, int number3) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (number1 + number2 < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println("Проверка пройдена успешно");
        }
    }
}
