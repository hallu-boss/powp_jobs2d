package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import edu.kis.powp.jobs2d.FigureCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.patterns.FigureCommandPatterns;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	private final Map<FigureCommand, Runnable> actionMap = Map.of(
			FigureCommand.FIGURE_JOE_1, () -> FiguresJoe.figureScript1(driverManager.getCurrentDriver()),
			FigureCommand.FIGURE_JOE_2, () -> FiguresJoe.figureScript2(driverManager.getCurrentDriver()),
			FigureCommand.FIGURE_COMMAND_SQ, () -> FigureCommandPatterns.figureSquare(driverManager.getCurrentDriver()),
			FigureCommand.FIGURE_COMMAND_X, () -> FigureCommandPatterns.figureX(driverManager.getCurrentDriver())
	);

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureCommand figureCommand = FigureCommand.fromTitle(e.getActionCommand());
        actionMap.get(figureCommand).run();
    }
}
