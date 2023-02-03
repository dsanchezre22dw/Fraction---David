package Exercises1.ex4;

public class Test {

    public static void main(String[] args) {

        // First I will initialise fractions that won't throw an exception in a try-catch
        try{
            Fraction fr1 = new Fraction(3,7);
            Fraction fr2 = new Fraction(2,5);
            Fraction fr3 = new Fraction(9,2);
            Fraction fr4 = new Fraction(4,3);
            Fraction fr5 = new Fraction(0,5);

            //Trying its methods
            System.out.println(fr1.add(fr1).toString()); // 6/7
            System.out.println(fr1.add(fr2).toString()); // 29/35
            System.out.println(fr1.add(fr3).toString()); // 69/14
            System.out.println(fr1.subtract(fr5).toString()); // 3/7
            System.out.println(fr2.subtract(fr3).toString()); // -41/10
            System.out.println(fr4.subtract(fr4).toString()); // 0/1
            System.out.println(fr1.multiply(fr5).toString()); // 0/1
            System.out.println(fr2.multiply(fr3).toString()); // 9/5
            System.out.println(fr4.multiply(fr4).toString()); // 16/9
            System.out.println(fr1.divide(fr2).toString()); // 15/14
            System.out.println(fr3.divide(fr3).toString()); // 1/1
            System.out.println(fr5.divide(fr4).toString()); // 0/1

        }catch (FractionException e){
            System.out.println(e.toString());
        }

        // Now I will initialise fractions that will throw an exception in some try-catch's
        try{
            Fraction fr1 = new Fraction(3,0); // Error

            //The code from now on won't be executed
            Fraction fr2 = new Fraction(2,5);
            Fraction fr3 = new Fraction(9,2);

            //Trying its methods
            System.out.println(fr1.add(fr1).toString());
            System.out.println(fr1.add(fr2).toString());
            System.out.println(fr1.subtract(fr1).toString());
            System.out.println(fr2.subtract(fr3).toString());
            System.out.println(fr1.multiply(fr3).toString());
            System.out.println(fr2.multiply(fr2).toString());
            System.out.println(fr3.divide(fr2).toString());
            System.out.println(fr3.divide(fr1).toString());

        }catch (FractionException e){
            System.out.println(e.toString());
        }

        // Again
        try{
            Fraction fr1 = new Fraction(4,3);
            Fraction fr2 = new Fraction(0,5);

            //Trying its methods
            System.out.println(fr1.add(fr1).toString()); // 8/3
            System.out.println(fr1.add(fr2).toString()); // 4/3
            System.out.println(fr2.subtract(fr1).toString()); // -4/3
            System.out.println(fr1.multiply(fr2).toString()); // 0/1
            System.out.println(fr2.divide(fr1).toString()); // 0/1
            System.out.println(fr1.divide(fr2).toString()); // Error
            //The code from now on won't be executed
            System.out.println(fr2.multiply(fr2).toString());

        }catch (FractionException e){
            System.out.println(e.toString());
        }









    }
}
