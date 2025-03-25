package edu.kis.powp.jobs2d;

public enum FigureCommand {
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2"),
    FIGURE_COMMAND_SQ("Figure Command Square"),
    FIGURE_COMMAND_X("Figure Command X");


    private final String title;

    FigureCommand(String title) {
        this.title = title;
    }

    public String getTitle() {return title;}

    public static FigureCommand fromTitle(String title) {
        for (FigureCommand figureCommand : FigureCommand.values()) {
            if (figureCommand.getTitle().equals(title)) {
                return figureCommand;
            }
        }
        throw new IllegalArgumentException("Unknown figure title: " + title);
    }
}
