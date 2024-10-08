public class Student extends Customer{

    private long studentID;
    private long studentsCounter;
    private final double DISCOUNT;

    public Student(String name, int[] size, double discount) {
        super(name, size);
        DISCOUNT = discount;
    }

    //public void printStudentsCounter() {

    }

