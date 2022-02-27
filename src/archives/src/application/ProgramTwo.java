package archives.src.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTwo {
    public static void main(String[] args) {
        String path = "/home/joel/IdeaProjects/course-java/src/archives/src/application/in.txt";

        try(BufferedReader fr = new BufferedReader(new FileReader(path))) {
            String line = fr.readLine();

            while(line != null) {
                System.out.println(line);
                line = fr.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
