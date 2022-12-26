import java.io.*;

public class Loader {
    public static GameProgress openProgress(String pathToLoadFile) {
        GameProgress gp = null;
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(pathToLoadFile))) {
            gp = (GameProgress) oos.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return gp;
    }
}
