package HomeWork2.Task1;

public class Program {

    private int number;


    public void checkingNumber(int number) throws InvalidArgumentException {
        if (number > 0) {
            System.out.println("Число корректно");
        } else {
            throw new InvalidArgumentException("Invalid argument : " + number + "некорректное число");
        }
    }

}
