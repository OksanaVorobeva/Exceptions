package HomeWork3.Task2.Ui.Commands;

import HomeWork3.Task2.Ui.View;

public class ReadFile implements Commands {
    private View view;

    public ReadFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.read();

    }

    @Override
    public String description() {

        return "Чтение файла";
    }
}
