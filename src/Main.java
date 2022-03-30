import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        WriteToFile data = new WriteToFile();
        Timsort sort = new Timsort();
        data.addFile();

        File iteration = new File("Iteration");
        PrintWriter iter = new PrintWriter(iteration);

        File time = new File("Time");
        PrintWriter num = new PrintWriter(time);

        File file = new File("File");

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String words[] = line.split(" ");
            int numArr[] = new int[words.length];
            System.out.println(numArr.length);
            for (int i = 0; i < words.length; i++) {
                numArr[i]=Integer.parseInt(words[i]);
            }

            System.out.println();
            long timeNanoS = System.nanoTime();
            sort.timSort(numArr);
            long timeNanoF = System.nanoTime();
            System.out.println(Timsort.iteration);
            iter.println(Timsort.iteration);
            System.out.print("nanoTime = " + (timeNanoF-timeNanoS));
            System.out.println();
            System.out.println();
            num.println(timeNanoF-timeNanoS);
        }
        iter.close();
        num.close();
        scanner.close();
    }
}