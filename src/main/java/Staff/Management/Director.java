package Staff.Management;



public class Director extends Manager {

    private double budget;

    public Director(String _name, String _NI, double _salary, String _deptName, double _budget) {
        super(_name, _NI, _salary, _deptName);
        this.budget = _budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return salary * 0.02;
    }


}
