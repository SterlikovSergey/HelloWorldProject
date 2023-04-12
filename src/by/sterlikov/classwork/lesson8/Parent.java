package by.sterlikov.classwork.lesson8;

public class Parent implements Personable {
    private String name;
    protected String value = "33";
    public Parent(){
        System.out.println("This is my default constructor");
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        } else {
            this.name = "Anonymous";
        }
    }

}