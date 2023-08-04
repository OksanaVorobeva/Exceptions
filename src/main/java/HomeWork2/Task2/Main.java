package HW.Task2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            int num = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            Program program = new Program();
            int result = program.division(num, num2);
            System.out.println("Результат " + result);

        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

