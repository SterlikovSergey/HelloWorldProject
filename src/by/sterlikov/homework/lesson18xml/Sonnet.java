package by.sterlikov.homework.lesson18xml;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement

public class Sonnet {

    private String sonnetTypes;
    private Author author;
    private String title;
    private Lines lines;

    public Sonnet() {
    }

    public Sonnet(String sonnetTypes, Author author, String title, Lines lines) {
        this.sonnetTypes = sonnetTypes;
        this.author = author;
        this.title = title;
        this.lines = lines;
    }

    public String getSonnetTypes() {
        return sonnetTypes;
    }

    public void setSonnetTypes(String sonnetTypes) {
        this.sonnetTypes = sonnetTypes;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lines getLines() {
        return lines;
    }

    public void setLines(Lines lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "sonnetTypes='" + sonnetTypes + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", lines=" + lines +
                '}';
    }
}
