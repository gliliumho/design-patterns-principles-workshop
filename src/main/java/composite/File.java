package composite;

public class File implements FileSystemObject {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void copy(String targetPath) {
        System.out.println(targetPath + "/" + name);
    }
}
