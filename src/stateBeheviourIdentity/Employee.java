package stateBeheviourIdentity;

// Define the Employee class
class Employee {
    // State (attributes)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    private double salary;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }





    // Constructor to initialize the state at the time of object creation
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Behavior (methods)
    void work() {
        System.out.println(name + " is working.");
    }

    void raiseSalary(double increase) {
        salary += increase;
        System.out.println(name + "'s new salary: " + salary);
    }
}