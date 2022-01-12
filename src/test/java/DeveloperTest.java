import Staff.Management.Manager;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer developer;

        @Before
        public void before() {
            developer = new Developer("Dave", "SC222N10", 40000.00);

        }

        @Test
        public void managerExists() {
            assertEquals("Dave", developer.getName());
            assertEquals("SC222N10", developer.getNI());
            assertEquals(40000.00, developer.getSalary(), 0.0);
        }

        @Test
        public void canRaiseSalary() {
            developer.raiseSalary(1.02);
            assertEquals(40800.00, developer.getSalary(), 0.0);
        }

        @Test
        public void canPayBonus() {
            assertEquals(400.00, developer.payBonus(), 0.0);
        }

}
