package controller;

import java.util.Scanner;
import model.EquationSolver;
import view.EquationSolverView;

public class EquationSolverController {

    private EquationSolver model;
    private EquationSolverView view;

    public EquationSolverController(EquationSolver model, EquationSolverView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter coefficient A: ");
                double a = scanner.nextDouble();
                System.out.print("Enter coefficient B: ");
                double b = scanner.nextDouble();
                model.setCoefficients(a, b, 0);
                double x = model.calculateSuperlativeEquation();
                view.displayResult("Solution x: " + x);

                int evenCount = countEvenOddSquareNumbers(a, b);
                view.displayNumbersInfo(evenCount, 2 - evenCount, 0);
            } else if (choice == 2) {
                System.out.print("Enter coefficient A: ");
                double a = scanner.nextDouble();
                System.out.print("Enter coefficient B: ");
                double b = scanner.nextDouble();
                System.out.print("Enter coefficient C: ");
                double c = scanner.nextDouble();
                model.setCoefficients(a, b, c);
                String result = model.calculateQuadraticEquation();
                view.displayResult(result);

                int evenCount = countEvenOddSquareNumbers(a, b, c);
                view.displayNumbersInfo(evenCount, 3 - evenCount, 0);
            } else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private int countEvenOddSquareNumbers(double... coefficients) {
        int evenCount = 0;
        for (double coeff : coefficients) {
            if (isSquareNumber(coeff)) {
                evenCount++;
            }
        }
        return evenCount;
    }

    private boolean isSquareNumber(double number) {
        double sqrt = Math.sqrt(number);
        return sqrt == (int) sqrt;
    }
}
