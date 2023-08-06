package HomeWork2.Task3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num3 = scanner.nextInt();

            Program program = new Program();
            program.division(num, num2, num3);

        } catch (DivisionByZeroException division) {
            System.out.println(division.getMessage());
        } catch (NumberOutOfRangeException number) {
            System.out.println(number.getMessage());
        } catch (NumberSumException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
