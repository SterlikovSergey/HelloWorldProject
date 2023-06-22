package by.sterlikov.homework.lesson7.task3;

import java.util.Date;
import java.util.List;

public class MainDocument {
    public static void main(String[] args) {
        ContractProduct contractProduct = new ContractProduct("t", 5, 01,
                new Date(2023, 4, 115));
        ContractEmployee contractEmployee = new ContractEmployee("sergey", new Date(2023, 4, 11),
                new Date(2023, 5, 10), 003, new Date(2023, 1, 3));
        Invoice invoice = new Invoice(23, 345, 005,
                new Date(2023, 6, 28));

        Register register = new Register();
        List<Document> documents = register.saveDocument(contractProduct);
        documents.add(contractEmployee);
        documents.add(invoice);
        register.infoDocument(documents);
    }
}
