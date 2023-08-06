package HomeWork3.Task2.FileHandler;

import java.io.Serializable;

public interface Writable {
    public boolean save(Object ob, String filePath);

    public Object read(String filePath);

    public void copy(String filePath, String filePath1);
}