import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path firstFile = Paths.get(args[0]);
        Path secondFile = Paths.get(args[1]);

        FileReader readFile = new FileReader(firstFile.toString());
        BufferedReader bufferedReadFile = new BufferedReader(readFile);
        FileWriter writeFile = new FileWriter(secondFile.toString());

        try {
            // Dohvat svake linije iz tekstualne datoteke
            String line;
            while ((line = bufferedReadFile.readLine()) != null) {
                // Ispis linije u konzolu ako je treći argument "-p" ili "-print"
                if (args.length == 3 && (args[3].equalsIgnoreCase("-p")
                        || args[3].equalsIgnoreCase("-print"))) {
                    System.out.println(line);
                } else {
                    writeFile.write(line);
                    writeFile.write("\n");
                }
            }
            System.out.println("Uspješno završeno!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            readFile.close();
            writeFile.close();
            bufferedReadFile.close();
        }
    }
}
