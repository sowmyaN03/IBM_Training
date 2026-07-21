import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filesh {

    public void readData(File f) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        File f = new File("Day-3/content.txt");

        try (Scanner sc = new Scanner(f)) {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(f)) {
            fw.write("Hello World");
            fw.append("\nHow are you doing?");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try (FileReader fr = new FileReader(f)) {
        //     while(fr.ready()) {
        //         System.out.print((char) fr.read());
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e1) {
        //     e1.printStackTrace();
        // }
    }
}