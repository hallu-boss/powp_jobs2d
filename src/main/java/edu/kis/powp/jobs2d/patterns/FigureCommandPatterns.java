package edu.kis.powp.jobs2d.patterns;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.AbstractDriverCommand;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;

public class FigureCommandPatterns {
    public static void figureSquare(Job2dDriver driver) {
        ArrayList<AbstractDriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(-120, -120));
        commands.add(new OperateToCommand(120, -120));
        commands.add(new OperateToCommand(120, 120));
        commands.add(new OperateToCommand(-120, 120));
        commands.add(new OperateToCommand(-120, -120));

        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.setCommands(commands);
        complexCommand.execute(driver);
    }
    public static void figureX(Job2dDriver driver) {
        ArrayList<AbstractDriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(-120, -120));
        commands.add(new OperateToCommand(120, 120));
        commands.add(new SetPositionCommand(-120, 120));
        commands.add(new OperateToCommand(120, -120));

        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.setCommands(commands);
        complexCommand.execute(driver);
    }
}
