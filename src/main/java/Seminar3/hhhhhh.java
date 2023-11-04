package Seminar3;

import java.util.Scanner;

public class hhhhhh {
    public static void main(String[] args) {
        try {
            CalculationData data = getInput();
            double result = calculate(data);
            System.out.println("Результат: " + result);
        } catch (InvalidInputException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static CalculationData getInput() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        return new CalculationData(num1, operator, num2);
    }

    public static double calculate(CalculationData data) throws ArithmeticException {
        switch (data.operator) {
            case '+':
                return data.num1 + data.num2;
            case '-':
                return data.num1 - data.num2;
            case '*':
                return data.num1 * data.num2;
            case '/':
                if (data.num2 == 0) {
                    throw new ArithmeticException("Деление на ноль недопустимо");
                }
                return data.num1 / data.num2;
            case '^':
                return Math.pow(data.num1, data.num2);
            default:
                throw new IllegalArgumentException("Недопустимая операция");
        }
    }

    static class CalculationData {
        double num1;
        char operator;
        double num2;

        CalculationData(double num1, char operator, double num2) {
            this.num1 = num1;
            this.operator = operator;
            this.num2 = num2;
        }
    }
}
