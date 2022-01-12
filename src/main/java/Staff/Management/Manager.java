package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    protected String deptName;

    public Manager(String _name, String _NI, double _salary, String _deptName){
        super(_name, _NI, _salary);
        this.deptName = _deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
