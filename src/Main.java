public class Main {
    public static void main(String[] args) {
        int min = Math.findMin(new int[]{5, 4, 89, 0, 64, -1});
        System.out.println(min);

        int max = Math.findMax(new int[] {8, 5, -14, 54, 0, 32});
        System.out.println(max);

        double area = Math.areaOfCircle(10);
        System.out.println(area);

        Employee employee1 = new Employee("Sarah", "Parker", "8384779877");
        Employee employee2 = new Employee("Olga", "Johnson", "3423434234");
        Employee employee3 = new Employee("Vika", "Willson", "4234232344");
        System.out.println(Employee.getNumberOfEmployees());

        System.out.println(Calculator.calcPi(10000));

        int h = 7;
        Pyramid.printPyramid(h);
    }
}
