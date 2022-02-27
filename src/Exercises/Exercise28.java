package Exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        String[] valueOne = sc.nextLine().split(",");

        System.out.print("");
        String[] valueTwo = sc.nextLine().split(",");

        System.out.print("");
        String[] valueThree = sc.nextLine().split(",");

        System.out.print("");
        String[] valueFour = sc.nextLine().split(",");

        String strPath = "/home/joel/IdeaProjects/course-java/src/Exercises/out/summary.csv";

        double quantityOne = Double.parseDouble(valueOne[1]) * Integer.parseInt(valueOne[2]);
        double quantityTwo = Double.parseDouble(valueTwo[1]) * Integer.parseInt(valueTwo[2]);
        double quantityThree = Double.parseDouble(valueThree[1]) * Integer.parseInt(valueThree[2]);
        double quantityFour = Double.parseDouble(valueFour[1]) * Integer.parseInt(valueFour[2]);

        String aString = valueOne[0] + "," + quantityOne + "\n" + valueTwo[0] + "," + quantityTwo + "\n" + valueThree[0] + "," + quantityThree + "\n" + valueFour[0] + "," + quantityFour + "\n";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))) {
            bw.write(aString);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
