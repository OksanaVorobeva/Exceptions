package HomeWork3.Task2.Service;

import HomeWork3.Task2.FileHandler.Writable;
import HomeWork3.Task2.Note.Note;
import HomeWork3.Task2.Notebook.Notebook;

public class Service {

    private Notebook notebook;
    private Writable writable;

    public Service(Notebook notebook, Writable writable) {
        this.notebook = notebook;
        this.writable = writable;
    }

    public void addNote(String note) {
        Note notes = new Note(note);
        notebook.addNode(notes);
    }

    public void save() {
        writable.save(notebook, "Test1.txt");
    }

    public void read() {
        notebook = (Notebook) writable.read("Test1.txt");

    }

    public void copy() {
        writable.copy("Test1.txt", "Test2.txt");
    }

    public String print() {
        return notebook.toString();
    }
}
