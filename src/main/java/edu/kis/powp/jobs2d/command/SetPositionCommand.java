package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand extends AbstractDriverCommand {
    public SetPositionCommand(int x, int y) {
        super(x, y);
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.setPosition(x, y);
    }
}
