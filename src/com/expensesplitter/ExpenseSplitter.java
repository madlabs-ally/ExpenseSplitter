package com.expensesplitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseSplitter {
    private static List<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Expense Splitter");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter person who paid: ");
                    String paidBy = scanner.nextLine();
                    expenses.add(new Expense(description, amount, paidBy));
                    System.out.println("Expense added successfully.");
                    break;

                case 2:
                    System.out.println("Expenses:");
                    for (Expense expense : expenses) {
                        System.out.println(expense);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
