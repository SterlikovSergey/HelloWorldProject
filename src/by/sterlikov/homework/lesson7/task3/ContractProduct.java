package by.sterlikov.homework.lesson7.task3;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class ContractProduct extends Document{
    private final String productType;
    private final int numberItems;


    public ContractProduct(String productType, int numberItems, int numberDocument,Date documentDate) {
        this.productType = productType;
        this.numberItems = numberItems;
        this.numberDocument = numberDocument;
        this.documentDate = documentDate;

    }
    @Override
    public String toString() {
        return "ContractProduct{" +
                "productType='" + productType + '\'' +
                ", numberItems=" + numberItems +
                ", numberDocument=" + numberDocument +
                ", documentDate=" + documentDate +
                '}';
    }
}
