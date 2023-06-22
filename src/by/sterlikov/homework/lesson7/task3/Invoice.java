package by.sterlikov.homework.lesson7.task3;

import java.util.Date;

public class Invoice extends Document{
    private final int codeDepartment;
    private final int totalAmount;
    public Invoice(int codeDepartment, int totalAmount, int numberDocument, Date dateDocument) {
        this.codeDepartment = codeDepartment;
        this.totalAmount = totalAmount;
        this.numberDocument = numberDocument;
        this.documentDate = dateDocument;
    }
    @Override
    public String toString() {
        return "Invoice{" +
                "codeDepartment=" + codeDepartment +
                ", totalAmount=" + totalAmount +
                ", numberDocument=" + numberDocument +
                ", documentDate=" + documentDate +
                '}';
    }
}
