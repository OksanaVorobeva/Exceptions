package HomeWork3.Task2.Ui.Commands;

import HomeWork3.Task2.Ui.View;

public class AddRecords implements Commands{

    private View view;

    public AddRecords(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addRecords();
    }

    @Override
    public String description() {
        return "Добавить новую запись";
    }
}
