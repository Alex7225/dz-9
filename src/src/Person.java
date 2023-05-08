public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean partner;

    public Person(String firstName, String lastName, int age, boolean partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    public boolean isRetired() {
        if (age >= 60) return true;
        else return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isPartner() {
        return partner;
    }
}