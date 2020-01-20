package Calculator2;

public class Calculator2 {

    public Integer calculate(Integer a, Integer b) {

        if (a == 0 || a == null || b == 0 || b == null) {
            throw new IllegalArgumentException();

        }
        return a + b;
    }
    public Integer substract(Integer a, Integer b) {
        return a - b;
    }
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
    public Integer divide(Integer a, Integer b) {
        if ( a == null || b == null || b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

    public Double calculateIncome(Integer grossIncome, Integer tax) {
        double nettoIncome = grossIncome - grossIncome * tax/100;

        return nettoIncome;
    }

}