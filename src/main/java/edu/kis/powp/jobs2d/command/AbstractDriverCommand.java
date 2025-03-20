package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.DriverCommand;

public abstract class AbstractDriverCommand implements DriverCommand {
    private int x;
    private int y;
    public AbstractDriverCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
