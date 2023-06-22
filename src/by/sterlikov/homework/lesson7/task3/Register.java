package by.sterlikov.homework.lesson7.task3;

import java.util.ArrayList;
import java.util.List;


public class Register extends Document implements Registerable {
    private final List<Document> documents = new ArrayList<>();

    @Override
    public List<Document> saveDocument(Document myNewDocument) {
        documents.add(myNewDocument);
        return documents;
    }

    @Override
    public void infoDocument(List<Document> myNewDocuments) {
        for (Document document : myNewDocuments) {
            System.out.println(document);
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
