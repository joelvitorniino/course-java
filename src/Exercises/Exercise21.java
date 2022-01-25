package Exercises;
import java.util.Scanner;
import entities.Student;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.next();
        student.noteOne = sc.nextDouble();
        student.noteTwo = sc.nextDouble();
        student.noteThree = sc.nextDouble();

        student.setNoteTotal();
        student.verifyNote();
    }
}
