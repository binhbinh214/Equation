package model;

public class EquationSolver {

    private double a;
    private double b;
    private double c;

    public void setCoefficients(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSuperlativeEquation() {
        double x = -b / a;
        return x;
    }

    public String calculateQuadraticEquation() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            return "No real roots.";
        }
    }
}
