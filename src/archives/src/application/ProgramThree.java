package archives.src.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramThree {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        String path = "/home/joel/IdeaProjects/course-java/src/archives/src/application/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
