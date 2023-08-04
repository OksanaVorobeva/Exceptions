package HW.Task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите  число: ");
            int num = scanner.nextInt();
            Program program = new Program();
            program.checkingNumber(num);

        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

