package view;

public class EquationSolverView {

    public void displayMenu() {
        System.out.println("===== Equation Program =====");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Please choose one option: ");
    }

    public void displayResult(String result) {
        System.out.println("Result: " + result);
    }

    public void displayNumbersInfo(int evenCount, int oddCount, int squareCount) {
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Square numbers count: " + squareCount);
    }
}
