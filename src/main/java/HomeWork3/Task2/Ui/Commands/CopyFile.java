package HomeWork3.Task2.Ui.Commands;

import HomeWork3.Task2.Ui.View;

public class CopyFile implements Commands {

    private View view;

    public CopyFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.copy();

    }

    @Override
    public String description() {
        return "Скопировать файл";
    }
}
