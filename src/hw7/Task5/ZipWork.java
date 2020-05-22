package hw7.Task5;

//Создать на диске каталог (папку).
//В созданном каталоге создать три файла с содержимым.
//Заархивировать эти три файла в одном архиве.
//Переименовать каталог.
//Вывести в консоль все содержимое каталога.
//Удалить каталог.

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipWork {
    public static void main(String[] args) {
        ZipOutputStream zos = null;
        File dir = new File("src/hw7/Task5/dir");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("A new directory is created\n");
        }

        File file1 = new File(dir, "file1.txt");
        File file2 = new File("src/hw7/Task5/dir", "file2.txt");
        File file3 = new File("src/hw7/Task5/dir", "file3.txt");
        boolean file1created;
        boolean file2created;
        boolean file3created;
        try {
            file1created = file1.createNewFile();
            file2created = file2.createNewFile();
            file3created = file3.createNewFile();

            fillInFile(file1);
            fillInFile(file2);
            fillInFile(file3);

            if (file1created && file2created && file3created) {
                System.out.println("Files are added to the directory\n");
            }

            zos = new ZipOutputStream(new FileOutputStream("src/hw7/Task5/zip.zip"));

            ZipEntry entry1 = new ZipEntry("file1.txt");
            ZipEntry entry2 = new ZipEntry("file2.txt");
            ZipEntry entry3 = new ZipEntry("file3.txt");
            zos.putNextEntry(entry1);
            zos.putNextEntry(entry2);
            zos.putNextEntry(entry3);
            System.out.println("Files are zipped to the archive\n");

            File renamedDir = new File("src/hw7/Task5/renamedDir");
            if (dir.renameTo(renamedDir)) {
                System.out.println("The folder has been renamed\n");
            }

            System.out.println("There are the following files in the directory:");
            File[] array = renamedDir.listFiles();
            if (array != null) {
                for (File item : array) {
                    System.out.println(item.getName());
                    item.delete();
                }
            }

            if (renamedDir.delete()) {
                System.out.println("\nThe directory has been deleted");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (zos != null)
                    zos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void fillInFile(File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write((int) new Date().getTime());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
