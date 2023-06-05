package by.sterlikov.homework.lesson18xml;

import java.util.List;

public class Lines {
    private List<String> line;

    public Lines() {
    }

    public Lines(List<String> line) {
        this.line = line;
    }

    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "line='" + line + '\'' +
                '}';
    }
}
