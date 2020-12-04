package Task2.interface2;

public class Main {
    public static void main(String[] args) {

        operationOnConsole();

    }

    public static void operationOnConsole(){

        MyCalculator myCalculator = new MyCalculator();
        myCalculator.plus();
        myCalculator.minus();
        myCalculator.multiply();
        myCalculator.devide();

    }
}
