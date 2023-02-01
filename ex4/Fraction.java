package Exercises1.ex4;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int num, int den){
        this.numerator = num;
        this.denominator = den;
    }

    @Override
    public String toString(){
        return "Numerator: " + this.numerator + "\nDenominator: " + this.denominator;
    }


    public Fraction add(Fraction fr){
        Fraction result = new Fraction((fr.denominator*this.numerator) + (this.denominator*fr.numerator),this.denominator*fr.denominator);

        return simplify(result);
    }

    public Fraction subtract(Fraction fr){
        Fraction result = new Fraction((fr.denominator*this.numerator) - (this.denominator*fr.numerator),this.denominator*fr.denominator);

        return simplify(result);
    }

    public Fraction multiply(Fraction fr){
        Fraction result = new Fraction(this.numerator*this.denominator,this.denominator*fr.denominator);

        return simplify(result);
    }

    public Fraction divide(Fraction fr){
        Fraction result = new Fraction(this.numerator*fr.denominator, this.denominator*fr.numerator);

        return simplify(result);
    }


    public static Fraction simplify(Fraction fr){
        int aux, a = fr.numerator, b = fr.denominator;

        while (b != 0){
            aux = b;
            b = a%b;
            a = aux;
        }
        return new Fraction(fr.numerator/a, fr.denominator/a);
    }









}
