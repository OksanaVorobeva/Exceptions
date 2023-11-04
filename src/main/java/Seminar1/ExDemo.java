package Seminar1;

public class ExDemo {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] num2 = {2, 0, 4, 4, 0, 8};
        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + " / " + num2[i] + " = " + num[i] / num2[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Попытка деления на ноль или выход за границы массива");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Элемент не найден");
            System.out.println("Фатальная ошибка");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println(exception.toString());
        }
    }
}



