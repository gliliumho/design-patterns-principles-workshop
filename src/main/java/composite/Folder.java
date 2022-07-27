package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemObject {
    private List<FileSystemObject> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemObject file) {
        fileList.add(file);
    }

    @Override
    public void copy(String targetPath) {
        final String target = targetPath + "/" + name;
        System.out.println(target);
        for (FileSystemObject file : fileList){
            file.copy(target);
        }
    }
}
