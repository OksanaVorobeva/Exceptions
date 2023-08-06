package HomeWork3.Task2.Ui.Commands;

import HomeWork3.Task2.Ui.View;

public class PrintFile implements Commands {
    private View view;

    public PrintFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.printFile();
    }

    @Override
    public String description() {
        return "Показать содержимое файла";
    }
}


