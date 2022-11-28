import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFilesDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\QLDownload");
        File desFile = new File("C:\\Users\\shinelon\\Desktop\\学习过程文件\\java\\commonOperation");
        copyFolder(srcFile, desFile);

    }

    // 复制文件夹
    private static void copyFolder(File srcFile, File desFile) throws IOException {
        // 判断是否是目录
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(desFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();

            }
            // 获取数据源file下所有文件或目录的file数组，进入更深层的文件位置
            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
                copyFolder(file, newFolder);
            }

        } else {// 判断是否是文件，如果是文件，直接复制，用字节流
            File newFile = new File(desFile, srcFile.getName());
            copyFile(srcFile, newFile);

        }
    }

    private static void copyFile(File srcFile, File desFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFile));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);

        }
        bos.close();
        bis.close();
    }

}
