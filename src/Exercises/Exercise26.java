package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> idList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        List<Double> salaryList = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Emplyoee #" + i + ":");

            System.out.println("Id: ");
            int id = sc.nextInt();

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            idList.add(id);
            nameList.add(name);
            salaryList.add(salary);

            System.out.println("List of employees:");

            for(Integer x : idList) {
                System.out.println(x);
            }

            for(String x : nameList) {
                System.out.println(x);
            }

            for(Double x : salaryList) {
                System.out.println(x);
            }
        }
    }
}
