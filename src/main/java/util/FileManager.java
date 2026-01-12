package main.java.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManager {
    public static final String ERROR_FILE_EXIST = "Error! File Exist.";
    public static final String ERROR_FILE_NOT_EXIST = "Error! File Not Exist.";
    public static final String ERROR_NOT_FOLDER = "Error! Path is not folder.";
    public static final String ERROR_SOURCE_NOT_EXIST = "Error! Source File Not Exist.";
    public static final String ERROR_FILE_EXIST_2 = "Error! newPath has File same name.";

    public static void main(String[] args) {
        String path = "C:\\Users\\pc\\Desktop\\Test.txt";

        if (isFileExists(path)) {
            System.out.println("File Exist");
        } else {
            System.out.println("File Not Exist");
        }

        try {
            createNewFile(path);
            System.out.println("File created");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //    Question 1: Check File is exists
//    Tạo 1 method có đầu vào là String path để check xem path đó có tồn tại hay không.
//            VD: path = &quot;C:\Users\pc\Desktop\Test.txt&quot;
//    Gợi ý: Tạo method boolean isFileExists(String pathFile)
    public static boolean isFileExists(String path) {
        File file = new File(path);
        return file.exists();
    }


    //    Question 2: Create new file
//    Tạo 1 method để có thể tạo được file.
//    Chú ý:
//    Kiểm tra xem file đã tồn tại hay chưa, nếu file đã tồn tại thì sẽ throw ra Exception &quot;Error!
//    File Exist.&quot;
//    Gợi ý:
//    Tạo method void createNewFile(String pathFile)
//    Vào tạo thêm method void createNewFile(String path, String fileName)
    public static void createNewFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        if (file.exists()) {
            throw new IOException(ERROR_FILE_EXIST);
        }
        file.createNewFile();
    }

    public static void createNewFile(String pathFile, String name) throws IOException {
        createNewFile(pathFile + File.separator + name);
    }

//    Question 4: Delete file
//    Tạo 1 method để có thể delete file
//    Chú ý:
//    Kiểm tra xem file đã tồn tại hay chưa, nếu file chưa tồn tại thì sẽ throw ra Exception
//&quot;Error! File Not Exist.&quot;
//    Gợi ý: Tạo method void deleteFile(String pathFile)

    public static void deleteFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            throw new IOException(ERROR_FILE_NOT_EXIST);
        }
        boolean delete = file.delete();

        if (!delete) {
            throw new IOException("File not deleted");
        }
    }

    //    Question 5: Check path is File or Folder
//    Tạo 1 method để kiểm tra xem path có thể là File hay Folder.
//    Gợi ý: Tạo method boolean isFolder(String path)
    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }


//    Question 6: Get all File name of Folder
//    Tạo 1 method để lấy ra tất cả các tên file trong 1 Folder.
//    Chú ý:
//    Kiểm tra xem path nhập vào có phải là folder hay không, nếu không phải thì sẽ throw
//    ra Exception &quot;Error! Path is not folder.&quot;
//    Gợi ý: Tạo method List&lt;String&gt; getAllFileName(String path)

    public static void getAllFileName(String path) throws IOException {
        File folder = new File(path);
        if (!folder.isDirectory()) {
            throw new IOException(ERROR_NOT_FOLDER);
        }
        File[] files = folder.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            System.out.println(file.getName());
        }

    }

    //    Question 7: Copy File
//    Tạo 1 method để copy file.
//    Chú ý:
//    Nếu file không tồn tại thì sẽ throw ra Exception &quot;Error! Source File Not Exist.&quot;
//    Nếu file đích đã tồn tại thì sẽ throw ra Exception &quot;Error! newPath has File same
//    name.&quot;
//    Gợi ý:
//    Tạo method void copyFile(String sourceFile, String distinationPath, String
//            newName)
//    Và tạo method void copyFile(String sourceFile, String newPath). Với File mới sẽ có
//    tên cùng với file cũ
    public static void copyFile(String sourceFile, String distinationPath, String newName) throws IOException {
        File file = new File(sourceFile);
        if (!file.exists()) {
            throw new IOException(ERROR_SOURCE_NOT_EXIST);
        }

        File dest = new File(distinationPath + File.separator + newName);

        if (dest.exists()) {
            throw new IOException(ERROR_FILE_EXIST_2);
        }

        try (FileInputStream in = new FileInputStream(file);
             FileOutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);

            }
        }
    }
}
