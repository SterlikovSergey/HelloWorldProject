package by.sterlikov.classwork.lesson8;

public class Children extends Parent{
    public Children() {
        super();
        System.out.println("This is my children constructor ");
        System.out.println(super.value);
    }

    /**
     * code return string  This is cool children
     * @return
     */
    @Override
    public String getName() {
        return "This is cool children";
    }
}
