package comp_decomp;

/**
 *
 * @author Tushar
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class Decompressor {
    public static void decompress(File file) throws IOException {
        String filePath = file.getAbsolutePath();
        String decompressedFilePath = filePath.substring(0, filePath.lastIndexOf(".gz"));

        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(decompressedFilePath);

        byte[] buffer = new byte[1024];
        int len;

        while ((len = gzip.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        gzip.close();
        fos.close();
        fis.close();

        System.out.println("File decompressed successfully!");
    }
}
