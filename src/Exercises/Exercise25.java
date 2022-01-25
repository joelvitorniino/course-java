package Exercises;

import entities.Room;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room[] vector = new Room[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int room = sc.nextInt();

            vector[room] = new Room(name, email);
        }

        System.out.println();

        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i++) {
            if(vector[i] != null) {
                System.out.println(i + ": " + vector[i]);
            }
        }

        sc.close();
    }
}
