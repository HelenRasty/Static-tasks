public class Employee {
    private static int numberOfEmployees;
    private String firsName;
    private String lastName;
    private String telephone;

    public Employee(String firsName, String lastName, String telephone) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
