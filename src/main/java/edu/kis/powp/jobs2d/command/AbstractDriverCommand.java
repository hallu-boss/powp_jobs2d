package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dtoDrawPanelAdapter;

public abstract class AbstractDriverCommand implements DriverCommand {
    protected int x;
    protected int y;

    public AbstractDriverCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
