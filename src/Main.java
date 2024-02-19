import core.calculator.Calculator;
import core.calculator.ComlexNumber;
import core.logger.Logger;
import core.logger.impl.LoggerTxt;
import core.view.View;


public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerTxt("log.txt");
        View view = new View(logger);
        view.run();

    }
}