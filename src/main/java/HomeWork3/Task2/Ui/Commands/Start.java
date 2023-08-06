package HomeWork3.Task2.Ui.Commands;

import HomeWork3.Task2.Ui.View;

public class Start implements Commands {

    private View view;

    public Start(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.start();
    }

    @Override
    public String description() {
        return "Старт";
    }
}
