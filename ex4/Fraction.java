package Exercises1.ex4;


public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int num, int den) throws FractionException {
        this.numerator = num;

        if (den == 0){
            throw new FractionException("Cannot instantiate a fraction with denominator 0");
        }
        this.denominator = den;

    }

    @Override
    public String toString(){
        return "Numerator: " + this.numerator + "  Denominator: " + this.denominator;
    }


    public Fraction add(Fraction fr) throws FractionException {
        Fraction result = new Fraction((fr.denominator*this.numerator) + (this.denominator*fr.numerator),this.denominator*fr.denominator);

        return simplify(result);
    }

    public Fraction subtract(Fraction fr) throws FractionException {
        Fraction result = new Fraction((fr.denominator*this.numerator) - (this.denominator*fr.numerator),this.denominator*fr.denominator);

        return simplify(result);
    }

    public Fraction multiply(Fraction fr) throws FractionException {
        Fraction result = new Fraction(this.numerator*fr.numerator,this.denominator*fr.denominator);

        return simplify(result);
    }

    public Fraction divide(Fraction fr) throws FractionException {
        if (fr.numerator == 0){
            throw new FractionException("This operation results in an invalid fraction");
        }

        Fraction result = new Fraction(this.numerator*fr.denominator, this.denominator*fr.numerator);
        return simplify(result);
    }


    public static Fraction simplify(Fraction fr) throws FractionException {
        int aux, a = fr.numerator, b = fr.denominator;

        while (b != 0){
            aux = b;
            b = a%b;
            a = aux;
        }
        return new Fraction(fr.numerator/a, fr.denominator/a);
    }









}
