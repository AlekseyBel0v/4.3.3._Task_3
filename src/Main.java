import java.io.File;

public class Main {
    public static void main(String[] args) {
        String pathToArchive = "/Users/belovaleksejolegovic/Desktop/Нетология/4. JAVA CORE/4.3 Streams, files, serialisation/4.3.1._Task_1/Games/savegames/save.zip";
        String pathToLoadFile = "/Users/belovaleksejolegovic/Desktop/Нетология/4. JAVA CORE/4.3 Streams, files, serialisation/4.3.1._Task_1/Games/savegames/save1.dat";
        Unpacker.openZip(pathToArchive);
        System.out.println("Справка для " + new File(pathToLoadFile).getName() + ":" + '\n'
                + Loader.openProgress(pathToLoadFile));
    }
}