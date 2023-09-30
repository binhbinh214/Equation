
import controller.EquationSolverController;
import model.EquationSolver;
import view.EquationSolverView;

public class Main {

    public static void main(String[] args) {
        EquationSolver model = new EquationSolver();
        EquationSolverView view = new EquationSolverView();
        EquationSolverController controller = new EquationSolverController(model, view);
        controller.run();
    }
}
