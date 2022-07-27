package composite;

public class FileSystemCompositeMain {
    public static void main(String[] args) {
        final Folder folder1 = new Folder("folder1");
        final Folder folder2 = new Folder("folder2");
        final Folder folder3 = new Folder("folder3");
        final FileSystemObject file1 = new File("file1");
        final FileSystemObject file2 = new File("file2");
        final FileSystemObject file3 = new File("file3");
        final FileSystemObject file4 = new File("file4");
        folder1.add(file1);
        folder1.add(file2);
        folder1.add(folder2);
        folder1.add(file3);
        folder2.add(folder3);
        folder2.add(file4);

        process(folder1);
    }

    private static void process(FileSystemObject fso) {
        fso.copy("C:/temp");
    }
}
