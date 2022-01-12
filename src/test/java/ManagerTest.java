import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Beth", "SC111N10", 30000.00, "Sales");

    }

    @Test
    public void managerExists() {
        assertEquals("Beth", manager.getName());
        assertEquals("SC111N10", manager.getNI());
        assertEquals(30000.00, manager.getSalary(), 0.0);
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.02);
        assertEquals(30600.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.0);
    }



}
