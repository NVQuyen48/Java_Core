package main.java.util;

import java.io.*;

public class IOManager {
    public static final String ERROR_FILE_NOT_EXIST = "Error! File Not Exist.";

    public static void main(String[] args) {

    }

    //    Question 1: Tạo method read File
//    Tạo 1 method có đầu vào là String filePath và return ra nội dung trong file.
//    Chú ý:
//    Nếu file không tồn tại thì sẽ throw ra Exception &quot;Error! File Not Exist.&quot; (sử dụng
//    FileManager ở trên đẻ check)
//    Gợi ý: Tạo method String readFile(String pathFile)
    public static String readFile(String path) throws IOException {
        if (!FileManager.isFileExists(path)) {
            throw new IOException(ERROR_FILE_NOT_EXIST);
        }

        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        }
        return sb.toString();
    }

    //    Question 2: Tạo method write content to File
//    Tạo 1 method để write file
//    Chú ý:
//    Nếu file không tồn tại thì sẽ throw ra Exception &quot;Error! File Not Exist.&quot; (sử dụng
//    FileManager ở exercise trên để check)
//    Gợi ý:
//    Tạo method void writeFile(String pathFile, isContinuing String content)
//    Nếu isContinuing = false thì sẽ xóa hết nội dung trong file đi và write content mới vào
//    Nếu isContinuing = true thì sẽ ghi content vào cuối file
    public static void writeFile(String pathFile, boolean isContinuing, String content)
            throws Exception {

        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        try (FileOutputStream fos = new FileOutputStream(pathFile, isContinuing);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write(content);
        }
    }
}
