package by.sterlikov.homework.lesson7.task3;

import java.util.Date;

public class ContractEmployee extends Document{
    private final String nameEmployee;
    private final Date startDate;
    private final Date endDate;

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numberDocument=" + numberDocument +
                ", documentDate=" + documentDate +
                '}';
    }


    public ContractEmployee(String nameEmployee, Date startDate, Date endDate,int numberDocument,Date documentDate) {
        this.nameEmployee = nameEmployee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberDocument = numberDocument;
        this.documentDate = documentDate;
    }

}
