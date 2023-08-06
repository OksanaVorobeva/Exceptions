package HomeWork3.Task2.Ui;


import HomeWork3.Task2.Presenter.Presenter;

public interface View {
    public void start();

    public void addRecords();

    public void save();

    public void read();

    public void copy();

    public void exit();

    public void printFile();


    public void setPresenter(Presenter presenter);

    void printAnswer(String answer);
}
