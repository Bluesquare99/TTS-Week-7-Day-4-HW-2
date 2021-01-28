public class Main {

    public static void main (String[] args) {

        // Declares a new Calculator object
        Calculator ti = new Calculator();

        // Showing functionality of Calculator class
        System.out.println(ti.add(2, 3));
        System.out.println(ti.divide(2, 3));
        System.out.println(ti.subtract(2, 3));
        System.out.println(ti.square(2, 3));

        // Declares a new MagicCalculator object
        MagicCalculator tiMagic = new MagicCalculator();
        System.out.println(tiMagic.squareRoot(64));
        System.out.println(tiMagic.sin(333));
        System.out.println(tiMagic.factorial(3));



    }
}
