package by.sterlikov.homework.lesson7.task3;

import java.util.List;

public interface Registerable {
    List<Document> saveDocument(Document myNewDocument);
    void infoDocument(List<Document> myNewDocument);
}
