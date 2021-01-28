import java.lang.Math;

public class MagicCalculator extends Calculator{

    private int num1;
    private int num2;

    public MagicCalculator(){
    }

    public int squareRoot(int num1) {
        return (int) Math.sqrt(num1);
    }

    public int sin(int num1) {
        return (int) Math.sin(num1);
    }

    public int cosine(int num1) {
        return (int) Math.cos(num1);
    }

    public int tangent(int num1) {
        return (int) Math.tan(num1);
    }

    public int factorial(int num1) {
        //Initialize 'total' variable to 1
        int total = 1;

        // Run a for loop until num1 gets to zero
        while (num1 > 0) {
            total = total * num1;
            num1--;
        }
        return total;
    }


}
