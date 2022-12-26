import java.io.*;
import java.util.zip.*;

public class Unpacker {
    public static void openZip(String pathToArhcive) {
        File file = new File(pathToArhcive);
        try (ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            ZipEntry ze;
            String name;
            long size;
            byte[] buffer;
            while ((ze = zis.getNextEntry()) != null) {
                name = ze.getName();
                size = ze.getSize();
                System.out.println("File name (size): " + name + " (" + size + ");");
                buffer = zis.readAllBytes();
                try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getParent() + "/" + name))) {
                bos.write(buffer);
                    zis.closeEntry();
                    bos.flush();
                    System.out.println("File " + name + " extracted;");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
