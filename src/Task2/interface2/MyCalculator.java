package Task2.interface2;
import Task2.interface1.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public void plus() {
        System.out.println("First Operation is Plus, please enter two numbers");
        double firstNumber = Double.parseDouble(scanner.next());
        double secondNumber = Double.parseDouble(scanner.next());
        double result = firstNumber + secondNumber;

        System.out.println("Operation Plus = " + result );
    }

    @Override
    public void minus() {
        System.out.println("Second operation is Minus, please enter two numbers");
        double firstNumber = Double.parseDouble(scanner.next());
        double secondNumber = Double.parseDouble(scanner.next());
        double result = firstNumber - secondNumber;

        System.out.println("Operation Minus = " + result);
    }

    @Override
    public void multiply() {
        System.out.println("Third operation is Multiply, please enter two numbers");
        double firstNumber = Double.parseDouble(scanner.next());
        double secondNumber = Double.parseDouble(scanner.next());
        double result = firstNumber * secondNumber;

        System.out.println("Operation Multiply = " + result);
    }

    @Override
    public void devide() {
        System.out.println("Fourth operation is Divide, please enter two numbers");
        double firstNumber = Double.parseDouble(scanner.next());
        double secondNumber = Double.parseDouble(scanner.next());
        double result = firstNumber / secondNumber;

        System.out.println("Operation Devide = " + result);

    }
}




