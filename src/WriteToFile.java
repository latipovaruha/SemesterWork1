import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;


public class WriteToFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("File");
        PrintWriter printWriter = new PrintWriter(file);

        int size = 1;
        int value = 100;
        int min = -5733937;
        int max =  5648383;

        while (size <= 100) {
            for (int i = 0; i < value; i++) {
                int s = ThreadLocalRandom.current().nextInt(min,max);
                printWriter.print(s + " ");
            }
            size++;
            value=100*size;
            printWriter.println();
        }
        printWriter.close();
    }

    public void addFile(){

    }
}

