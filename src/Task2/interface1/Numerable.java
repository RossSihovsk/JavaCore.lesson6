package Task2.interface1;

import java.util.Scanner;

public interface Numerable extends Plus, Minus, Multiply, Devide {

    Scanner scanner = new Scanner(System.in);

    @Override
    void plus();

    @Override
    void minus();

    @Override
    void multiply();

    @Override
    void devide();

}