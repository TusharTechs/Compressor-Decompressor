package comp_decomp;

/**
 *
 * @author Tushar
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compressor {
    public static void compress(File file) throws IOException {
        String filePath = file.getAbsolutePath();
        String compressedFilePath = filePath + ".gz";

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(compressedFilePath);
        GZIPOutputStream gzip = new GZIPOutputStream(fos);

        byte[] buffer = new byte[1024];
        int len;

        while ((len = fis.read(buffer)) != -1) {
            gzip.write(buffer, 0, len);
        }

        gzip.close();
        fos.close();
        fis.close();

        System.out.println("File compressed successfully!");
    }
}
