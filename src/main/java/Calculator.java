import java.lang.Math;

public class Calculator {

    private int num1;
    private int num2;

    public Calculator(){
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide (int num1, int num2) {
        return num1 / num2;
    }

    public int square (int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

}
