package Seminar1;

public class Program {

    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("До генерации исключения");
            nums[7] = 10;
            System.out.println("После генерации исключения");
        } catch ( ArithmeticException exception) {
            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");

    }
}
