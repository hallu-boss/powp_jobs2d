package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dtoDrawPanelAdapter;

public abstract class AbstractDriverCommand implements DriverCommand {
    protected int x;
    protected int y;
    private Job2dDriver driver;

    public AbstractDriverCommand(int x, int y) {
        this.x = x;
        this.y = y;
        this.driver = new Job2dDriver() {
            @Override
            public void setPosition(int i, int i1) {

            }

            @Override
            public void operateTo(int i, int i1) {

            }
        }
    }
}
