package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    ArrayList<AbstractDriverCommand> commands;

    public ComplexCommand() {
        this.commands = null;
    }

    public void setCommands(ArrayList<AbstractDriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        if (commands == null) return;

        for (AbstractDriverCommand command : commands) {
            command.execute(driver);
        }
    }
}
