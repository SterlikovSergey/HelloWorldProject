package by.sterlikov.classwork.lesson8;

public class BadParent implements Personable {
    private String name;

    /**
     * return is string This is bad Dad
     *
     * @return
     */
    public String getName() {
        return "This is bad Dad " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
