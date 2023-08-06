package HomeWork3.Task2;

import HomeWork3.Task2.FileHandler.FileHandler;
import HomeWork3.Task2.Notebook.Notebook;
import HomeWork3.Task2.Presenter.Presenter;
import HomeWork3.Task2.Service.Service;
import HomeWork3.Task2.Ui.Console;
import HomeWork3.Task2.Ui.View;

public class Program {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        View view = new Console();
        Service service = new Service(notebook, new FileHandler());
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}
