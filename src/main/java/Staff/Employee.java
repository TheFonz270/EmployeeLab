package Staff;

public abstract class Employee {

    protected String name;
    protected String NI;
    protected double salary;

    public Employee(String _name, String _NI, double _salary){
        this.name = _name;
        this.NI = _NI;
        this.salary = _salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        if (_name != ""){
            this.name = _name;
        }
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        if (increment > 1.00) {
            this.salary *= increment;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
