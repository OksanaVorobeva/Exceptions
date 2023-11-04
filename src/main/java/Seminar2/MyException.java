package Seminar2;

class MyException extends Exception {
    public MyException() {
        super("This is my exception");
    }

    public static class Test {
        public static void main(String[] args) {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
