package com.expensesplitter;

public class Expense {
    private String description;
    private double amount;
    private String paidBy;

    public Expense(String description, double amount, String paidBy) {
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    @Override
    public String toString() {
        return String.format("Expense: %s, Amount: %.2f, Paid By: %s", description, amount, paidBy);
    }
}
