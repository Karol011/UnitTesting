public class Calculator {

    public int calculate(int a, int b) {
        return a+b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }

    public double calculateIncome(int grossIncome, int tax) {
        double nettoIncome = grossIncome - grossIncome * tax/100;

        return nettoIncome;
    }

}
