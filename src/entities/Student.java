package entities;

public class Student {
    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;

    public double setNoteTotal() {
        return noteOne + noteTwo + noteThree;
    }

    public double verifyNote() {
        double total = setNoteTotal();

        if(total >= 60) {
            System.out.println("FINAL GRADE = " + total);
            System.out.println("PASS");
        } else {
            double totalLess = 60.00 - total;
            System.out.println("FINAL GRADE = " + total);
            System.out.println("FAILED");
            System.out.println("MISSING " + totalLess + " POINTS");
        }

        return 0;
    }
}
