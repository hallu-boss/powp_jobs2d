package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand extends AbstractDriverCommand {
    public OperateToCommand(int x, int y) {
        super(x, y);
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(x, y);
        driver.setPosition(x, y);
    }
}
