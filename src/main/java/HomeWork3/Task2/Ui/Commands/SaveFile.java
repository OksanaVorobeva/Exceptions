package HomeWork3.Task2.Ui.Commands;

import HomeWork3.Task2.Ui.View;

public class SaveFile implements Commands {

    private View view;

    public SaveFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.save();
    }

    @Override
    public String description() {

        return "Сохранить файл";
    }
}
