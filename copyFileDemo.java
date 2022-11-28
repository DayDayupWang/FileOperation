import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * copyFile
 */
public class copyFileDemo {

    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\QLDownload");
        String srcFolderName = srcFolder.getName();
        File desFolder = new File("C:\\Users\\shinelon\\Desktop\\学习过程文件\\java\\commonOperation", srcFolderName);
        System.out.println(desFolder);
        // 判断文件名是否存在，不存在则创建
        if (!desFolder.exists()) {
            desFolder.mkdir();
            System.out.println("创建好了");
        }
        // 获取数据源目录下所有文件的file数组
        File[] listFiles = srcFolder.listFiles();
        for (File srcFile : listFiles) {
            String srcFileName = srcFile.getName();
            // 组合得到目的地文件
            File desFile = new File(desFolder, srcFileName);
            copyFile(srcFile, desFile);
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