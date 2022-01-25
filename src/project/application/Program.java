package project.application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import project.entities.Register;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Register> list = new ArrayList<>();

        System.out.println("How many clients will be registered? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Client #" + i + ":");

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("E-mail: ");
            String email = sc.next();

            System.out.println("Password: ");
            String password = sc.next();

            System.out.println("Gender: ");
            char gender = sc.next().charAt(0);

            System.out.println("Birth: ");
            String date = sc.next();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date dt = sdf.parse(date);

            list.add(new Register(name, email, password, gender, dt));
        }

        System.out.println("List of clients: ");

        for(Register x : list) {
            System.out.println(x);
        }
    }
}
